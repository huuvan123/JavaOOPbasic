package Bai15OOP;

import java.util.*;
import java.time.*;

public class DongHo {
	private int Gio, Phut, Giay;
	private boolean LaBuoiSang;

	public int getGio() {
		return Gio;
	}

	public void setGio(int gio) {
		Gio = gio;
	}

	public int getPhut() {
		return Phut;
	}

	public void setPhut(int phut) {
		Phut = phut;
	}

	public int getGiay() {
		return Giay;
	}

	public void setGiay(int giay) {
		Giay = giay;
	}

	public boolean getLaBuoiSang() {
		return LaBuoiSang;
	}

	public void setLaBuoiSang(boolean laBuoiSang) {
		LaBuoiSang = laBuoiSang;
	}

	private Scanner sc = new Scanner(System.in);

	private int NhapSo(String msgNhap, String msgLoi, int min, int max) {
		int so = 0;
		boolean ok = false;
		do {
			try {
				System.out.println(msgNhap);
				so = sc.nextInt();
				ok = true;
				ok = true && so >= min && so <= max;
			} catch (Exception e) {
				System.err.println(msgLoi);
				sc.nextLine();
			}

		} while (!ok);
		return so;
	}

	public DongHo(int Gio, int Phut, int Giay) {
		setGio(Gio);
		setPhut(Phut);
		setGiay(Giay);
	}

	public DongHo() {
		setGio(NhapSo(" Nhập vào số giờ : ", "nhập trong khoảng [0-24]", 0, 24));
		setGiay(NhapSo("nhập vào số giây : ", "nhập trong khoảng [0-60]", 0, 60));
		setPhut(NhapSo("nhập vào số Phút : ", "nhập trong khoảng [0-60]", 0, 60));
	}

	public DongHo LayKhoangTG(DongHo dh) {
		int dh1 = Math.abs(Gio * 3600 + Phut * 60 + Giay - (dh.Gio * 3600 + dh.Phut * 60 + dh.Giay));
		return new DongHo(dh1 / 3600, (dh1 % 3600) / 60, (dh1 % 3600) % 60);
	}

	public void InThongTin() {
		System.out.println(Gio + " Giờ " + Phut + "  phút " + Giay +" giây ");
	}

}