package quanLyKho;
import java.io.IOException;
import java.util.Scanner;

public class MatHang {
	
	 private int id;
     private String ten;
     private int soLuong;
     private int dienTich;
     
     public MatHang() {
		// TODO Auto-generated constructor stub
	}
     
     public String toString() {
    	 return "MatHang("+" ID: "+id+" Ten: "+ten+" Dien Tich: "+dienTich+" So Luong: "+soLuong+')';
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
   	     System.out.println("So Luong: " +soLuong);
    }
   
    public void Nhap() {
    	 layout hien = new layout();
   	     Scanner Xuat = new Scanner(System.in);
   	     hien.hien("nhap ID: ");
   	 
   	     id=Integer.parseInt(Xuat.nextLine());
   	     Xoa();
   	     
    }
     
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getDienTich() {
		if(ten.equals("CPU")) {
			dienTich=2;
		}
		return dienTich;
	}

	public void setDienTich(int dienTich) {
		this.dienTich = dienTich;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getSoLuong() {
		return soLuong;
	}

}
