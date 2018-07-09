package quanLyKho;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class quanLyKho {
    public static void Xoa() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	public static void main(String[] args) {
           quanLy();
	}
	
	public static void quanLy() {
		 ArrayList<KhoHang> ListKho = new ArrayList<>();
		 ArrayList<KhuVuc> ListKhu = new ArrayList<>();
		 Scanner Nhap = new Scanner(System.in);
		 layout hien = new layout();
		 while(true) {
			 
			 System.out.println("1.Nhap Kho");
			 System.out.println("2.Nhap Khu");
			 System.out.println("3.Nhap Mat Hang");
			 System.out.println("4.Hien Thi");
			 System.out.println("5.Xuat");
			 System.out.println("6.Bao Cao");
			 System.out.println("7.Thoat");
			 System.out.println("Chon: ");
			 
			 int choose = Integer.parseInt(Nhap.nextLine());
			 Xoa();
			 switch(choose) {
			 case 1: 
				 KhoHang kho = new KhoHang();
				 kho.Nhap();
				 ListKho.add(kho);
				 kho.HienThi();
				 break;
			 case 2:
				 for (KhoHang a : ListKho) {
					System.out.println(a);
				 }
				 hien.hien("Chon Kho");
				
				 int chon = Integer.parseInt(Nhap.nextLine());
				 Xoa();
			     for (KhoHang a : ListKho) {
					if(a.getId() == chon) {
						for (int i = 0; i < a.getSoKhu(); i++) {
							System.out.println("Nhap Khu Thu: " + (i+1));
							KhuVuc khu = new KhuVuc();
							khu.Nhap();
							khu.setDienTich(a.getDienTich()/a.getSoKhu());
							ListKhu.add(khu);
						}
						ListKho.get(chon-1).setListKhu(ListKhu);
					}
					
				}
			     for (KhoHang a : ListKho) {
					System.out.println(a);
				}
				 break;
			 case 3:
			       ArrayList<MatHang> List_MH = new ArrayList<>();
			        KhuVuc khu = new KhuVuc();
			        Scanner nhap = new Scanner(System.in);
			        System.out.println("Cac kho hien tai dang co: ");
			        for (KhoHang a : ListKho) {
			            System.out.println(a);
			        }
			        
			        hien.hien("Chon ma kho muon them: ");
			        int maKho1 = Integer.parseInt(nhap.nextLine());
			        Xoa();
			        for (int i = 0; i < ListKho.size(); i++) {
			            if (ListKho.get(i).getId() == maKho1) {
			                System.out.println("Cac khu trong kho: ");
			                //list khu trong kho
			                for (KhuVuc a : ListKho.get(i).getListKhu()) {
			                    System.out.println(a);
			                }
			                hien.hien("Chon ma khu : ");
			                
			                int maKhu = Integer.parseInt(nhap.nextLine());
			                Xoa();
			                for (KhuVuc k : ListKho.get(i).getListKhu()) {
			                    if (k.getId() == maKho1) {
			                    	hien.hien("Ban muon nhap mat hang nao: ");
			                        
			                        String tenMH = nhap.nextLine();
			                        Xoa();
			                        khu.setTen(tenMH);
			                        if (tenMH.equals("CPU")) {
			                            CPU cpu = new CPU();
			                            hien.hien("Nhap ma mat hang: ");
	                                	int maMH=Integer.parseInt(nhap.nextLine());
	                                	Xoa();
			                            for (int j = 0; j <= List_MH.size(); j++) {
			                                if (List_MH.size() == 0) {
						                        cpu.setId(maMH);
						                        cpu.setTen(tenMH);
						                        hien.hien("So luong: ");
			                                    
			                                    cpu.getDienTich();
			                                    cpu.setSoLuong(Integer.parseInt(nhap.nextLine()));
			                                    Xoa();
			                                    cpu.Nhap();
			                                    
			                                    List_MH.add(cpu);
			                                } else {
			                                    if (List_MH.get(i).getId() != maMH) {
			                                    	hien.hien("So luong: ");
			                                        cpu.setSoLuong(Integer.parseInt(nhap.nextLine()));
			                                        Xoa();
			                                        cpu.setTen(tenMH);
			                                        cpu.Nhap();
			                                        List_MH.add(cpu);
			                                    } else {
			                                    	System.out.println("trong kho da co mat hang nay");
			                                    	hien.hien("ban muon nhan them bao nhieu: ");
			                                        int slThem = Integer.parseInt(nhap.nextLine());
			                                        Xoa();
			                                        List_MH.get(i).setSoLuong(cpu.getSoLuong() + slThem);
			                                    }
			                                }
			                                ListKho.get(maKho1 - 1).getListKhu().get(maKhu - 1).setListMatHang(List_MH);
			                                ListKho.get(maKho1 - 1).getListKhu().get(maKhu - 1).setTrangThai("Da chua hang");
			                            }
			                            for (MatHang a : List_MH) {
			                                System.out.println(a);
			                            }
			                        }
			                    }
			                }
			            }
			        }
			                   
			     break;
			 case 4:
			     Scanner Nhap1 = new Scanner(System.in);
			        hien.hien("Hien thong tin: ");
			        
			        for (KhoHang a : ListKho) {
			            System.out.println(a);
			        }
			  
			     break;
			 case 5:
			        Scanner nhap1 = new Scanner(System.in);
			        hien.hien("Ban muon xuat mat hang nao: ");
			        String tenMH = nhap1.nextLine();
			        Xoa();
			        System.out.println("Thong tin Kho: ");
			        for (KhoHang a : ListKho) {
			            System.out.println(a);
			        }
			        hien.hien("Chon ma kho: ");
			        
			        int maKho = Integer.parseInt(nhap1.nextLine());
			        Xoa();
			        System.out.println("Thong tin khu trong kho " + ListKho.get(maKho - 1).getTen());
			        for (KhuVuc a : ListKho.get(maKho - 1).getListKhu()) {
			            System.out.println(a);
			        }
			        hien.hien("Chon ma khu: ");
			        int maKhu = Integer.parseInt(nhap1.nextLine());
			        Xoa();
			        for (int i = 0; i < ListKho.get(maKho - 1).getListKhu().size(); i++) {
			            if (ListKho.get(maKho - 1).getListKhu().get(i).getId() == maKhu) {
			                for (int j = 0; j < ListKho.get(maKho - 1).getListKhu().get(i).getListMatHang().size(); j++) {
			                    if (ListKho.get(maKho - 1).getListKhu().get(i).getListMatHang().get(j).getTen().equals(tenMH)) {
			                        for (MatHang a : ListKho.get(maKho - 1).getListKhu().get(i).getListMatHang()) {
			                            System.out.println(a);
			                        }
			                        hien.hien("Moi ban chon Thu tu mat hang: ");
			                       
			                      
			                        int maMH = Integer.parseInt(nhap1.nextLine());
			                        Xoa();
			                        if (ListKho.get(maKho - 1).getListKhu().get(i).getListMatHang().get(j).getId() == maMH) {
			                        	hien.hien("Ban muon xuat bao nhieu cai  " + tenMH + " : ");
			                           
			                            int sl = Integer.parseInt(nhap1.nextLine());
			                            Xoa();
			                            if (sl > ListKho.get(maKho - 1).getListKhu().get(i).getListMatHang().get(j).getSoLuong()) {
			                                System.out.println("So luong ban muon xuat da vuot qua so luong trong khu!");
			                            } else {
			                                System.out.println("Xuat kho thanh cong!");
			                                ListKho.get(maKho - 1).getListKhu().get(i).getListMatHang().get(j).setSoLuong(ListKho.get(maKho - 1).getListKhu().get(i).getListMatHang().get(j).getSoLuong() - sl);
			                                System.out.println("So luong san pham " + tenMH + " trong kho con lai la: " + ListKho.get(maKho - 1).getListKhu().get(i).getListMatHang().get(j).getSoLuong());
			                                PhieuXuat px = new PhieuXuat();
			                                ArrayList<PhieuXuat> List_PX = new ArrayList<>();
			                                px.setTenMH(tenMH);
			                                px.setMaMH(maMH);
			                                px.setSoLuongConLai(ListKho.get(maKho - 1).getListKhu().get(i).getListMatHang().get(j).getSoLuong());
			                                px.setSoLuongXuat(sl);
			                                px.setViTri("Thuoc khu " + ListKho.get(maKho - 1).getListKhu().get(i).getTen());
			                                List_PX.add(px);
			                                ListKho.get(maKho - 1).setListPX(List_PX);
			                                for (PhieuXuat a : ListKho.get(maKho-1).getListPX()) {
			                                    System.out.println(a);
			                                }
			                            }
			                        } else {
			                            System.out.println("nhap sai ma MH");
			                        }
			                    } else {
			                        System.out.println("trong khu k co mat hang ban can xuat");
			                    }
			                }
			            }
			        }
				 break;
			 case 6:
			       Scanner nhap2 = new Scanner(System.in);

			        for (KhoHang a : ListKho) {
			            System.out.println(a);
			        }
			        hien.hien("Chon  kho xem  ");
			
			        int chonKHO=Integer.parseInt(nhap2.nextLine());
			        Xoa();
			        for (int i = 0; i < ListKho.size(); i++) {
			            if(ListKho.get(i).getId()==chonKHO){
			                for (PhieuXuat a : ListKho.get(i).getListPX()) {
			                    System.out.println("Kho "+ListKho.get(i).getTen()+" : ");
			                    System.out.println(a); 
			                }
			            }
			        }
			    
				 break;
			 case 7:
				 break;
			 }
		 }
	}
}