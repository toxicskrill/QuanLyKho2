package quanLyKho;

import java.io.IOException;
import java.util.Scanner;

public class CPU extends MatHang{
	
    private int tocDoXuLy;
     
    public CPU() {
		super();
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
    	 System.out.println("ID: " +super.getId());
  	     System.out.println("Ten: " +super.getTen());
  	     System.out.println("Dien Tich" +super.getDienTich());
  	     System.out.println("Toc Do Xu Ly: " +tocDoXuLy);
    }
    
    public void Nhap() {
    	 layout hien = new layout();
         Scanner Xuat = new Scanner(System.in);
         hien.hien("Toc Do Xu Ly: ");
  	     tocDoXuLy=Integer.parseInt(Xuat.nextLine());
  	     Xoa();
  	     
    }

	public int getTocDoXuLy() {
		return tocDoXuLy;
	}

	public void setTocDoXuLy(int tocDoXuLy) {
		this.tocDoXuLy = tocDoXuLy;
	}
}
