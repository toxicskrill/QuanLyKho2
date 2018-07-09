package quanLyKho;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class KhoHang {
	
	private int id;
	private String ten;
	private int DienTich;
	private int SoKhu;
	private ArrayList<KhuVuc> ListKhu;
	private ArrayList<PhieuXuat> ListPX;
	 
	public void HienThi() {
		layout show = new layout();
		 show.addLine("ID: " +id);
		 show.addLine("Ten: " +ten);
		 show.addLine("Dien Tich: " +DienTich);
		 show.addLine("So Khu: " +SoKhu);
		 show.render();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "kho(" + "id: "+ id +" ten: "+ten+" DienTich: "+DienTich+" SoKhu: "+ SoKhu +" ListKhu "+ListKhu+')';
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
	
	public void Nhap() {
		Scanner nhap = new Scanner(System.in);
		layout hien = new layout();
		hien.hien("nhap ID: ");
	
		id=Integer.parseInt(nhap.nextLine());
		Xoa();
		hien.hien("nhap Ten: ");
	
		ten=nhap.nextLine();
	    Xoa();
	    hien.hien("nhap Dien Tich: ");
		
		DienTich=Integer.parseInt(nhap.nextLine());
        Xoa();
        hien.hien("nhap So Khu");
	
		SoKhu=Integer.parseInt(nhap.nextLine());
        Xoa();
		
	}
	
	public KhoHang() {
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

	public void setDienTich(int dienTich) {
		DienTich = dienTich;
	}

	public int getSoKhu() {
		return SoKhu;
	}

	public void setSoKhu(int soKhu) {
		SoKhu = soKhu;
	}
	public void setListKhu(ArrayList<KhuVuc> listKhu) {
		ListKhu = listKhu;
	}
	
	public ArrayList<KhuVuc> getListKhu() {
		return ListKhu;
	}

	public ArrayList<PhieuXuat> getListPX() {
		return ListPX;
	}

	public void setListPX(ArrayList<PhieuXuat> listPX) {
		ListPX = listPX;
	}
}
