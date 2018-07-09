package quanLyKho;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class KhuVuc {
	
     private int id;
     private String ten;
     private String TrangThai;
     private int DienTich;
     private ArrayList<MatHang> ListMatHang;
     
     public void setDienTich(int dienTich) {
		DienTich = dienTich;
	}
     
     public void Xoa() {
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
     
     public void HienThi() {
    	 System.out.println("ID: " +id);
    	 System.out.println("Ten: " +ten);
    	 System.out.println("Dien Tich" +DienTich);
     }
     
     
     public void Nhap() {
    	 layout hien = new layout();
    	 Scanner Xuat = new Scanner(System.in);
    	 hien.hien("nhap ID: ");
    	 id=Integer.parseInt(Xuat.nextLine());
    	 Xoa();
    	 hien.hien("nhap Ten: ");
    	 ten=Xuat.nextLine();
    	 Xoa();
    	 
     }
     
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "khu("+"ID: "+id+" Ten: "+ten+" Dien Tich: "+DienTich+"ListMH:"+ListMatHang+')';
    }
      
    public KhuVuc() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getDienTich() {
		return DienTich;
	}

	public ArrayList<MatHang> getListMatHang() {
		return ListMatHang;
	}

	public void setListMatHang(ArrayList<MatHang> listMatHang) {
		ListMatHang = listMatHang;
	}

	public String getTrangThai() {
		return TrangThai;
	}

	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
    
}
