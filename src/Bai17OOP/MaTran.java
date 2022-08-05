package Bai17OOP;

import java.util.*;

public class MaTran {
	private int SoHang, SoCot;
	private int[][] MaTrix = new int[100][100];

	public int getSoHang() {
		return SoHang;
	}

	public void setSoHang(int soHang) {
		SoHang = soHang;
	}

	public int getSoCot() {
		return SoCot;
	}

	public void setSoCot(int soCot) {
		SoCot = soCot;
	}

	public int[][] getMaTrix() {
		return MaTrix;
	}

	public void setMaTrix(int[][] maTrix) {
		MaTrix = maTrix;
	}

	private Scanner sc = new Scanner(System.in);

	public MaTran() {
		System.out.println("nhap so hang ,so cot");
		SoHang = sc.nextInt();
		SoCot = sc.nextInt();
		setMaTrix(NhapMaTran(SoHang, SoCot, MaTrix));
	}

	public int[][] NhapMaTran(int SoHang, int SoCot,int[][] MaTrix) {
		for (int i = 0; i < SoHang; i++) {
			for (int j = 0; j < SoCot; j++) {
				System.out.println("MaTrix :[" + i + "," + j + "] =");
				MaTrix[i][j] = sc.nextInt();
			}
		}
		return MaTrix;
	}

	public MaTran(int SoHang, int SoCot, int[][] MaTrix) {
		setSoHang(SoHang);
		setSoCot(SoCot);
		setMaTrix(MaTrix);
	}

	public MaTran CongMaTrix(MaTran mt) {
		if (SoHang != mt.SoHang || SoCot != mt.SoCot) {
			System.err.println("Khong gia tri thoa man !");
			return null;
		}
		MaTran matran = new MaTran(SoHang, SoCot, new int[SoHang][SoCot]);
		for (int i = 0; i < SoHang; i++) {
			for (int j = 0; j < SoCot; j++) {
				matran.MaTrix[i][j] = MaTrix[i][j] + mt.MaTrix[i][j];
			}
		}
		return matran;
	}

	public void InThongTin() {
		System.out.println("Ma trận :");
	    for (int i = 0; i < SoHang; i++) {
	        for (int j = 0; j < SoCot; j++) {
	            System.out.print(MaTrix[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }
	}
}
