package Bai13OOP;

import java.util.*;

public class SoNguyen {
	private int GiaTri;
	private Boolean LaSoChan, LaSoNguyenTo, LaSoDoiXung;

	public void setGiaTri(int giaTri) {
		GiaTri = giaTri;
		LaSoChan = KTChan();
		LaSoNguyenTo = KiemTraSoNguyenTo();
		LaSoDoiXung = KiemTraDoiXung();
	}

	public int getGiaTri() {
		return GiaTri;
	}

	public Boolean getLaSoChan() {
		return LaSoChan;
	}

	public Boolean getLaSoNguyenTo() {
		return LaSoNguyenTo;
	}

	public Boolean getLaSoDoiXung() {
		return LaSoDoiXung;
	}

	public Boolean KTChan() {
		if (GiaTri % 2 == 0) {
			System.out.println("la so chan");
			return true;
		} else {
			System.err.println("khong phai la so chan ");
			return false;
		}
	}

	public Boolean KiemTraSoNguyenTo() {
		if (GiaTri < 2) {
			return false;
		}
		if (GiaTri == 2 || GiaTri == 3 || GiaTri == 5 || GiaTri == 7) {
			return true;
		}
		if (GiaTri % 2 == 0) {
			System.err.println("không là số nguyên tố ");
			return false;
		}
		for (int i = 3; i < Math.sqrt(GiaTri); i++) {
			if (GiaTri % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

	public Boolean KiemTraDoiXung() {
		char[] arr = String.valueOf(GiaTri).toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length - 1 - i])
				return false;

		}
		return true;
	}

	private Scanner sc = new Scanner(System.in);

	public SoNguyen() {
		System.out.println("Nhap vao so nguyen N : ");
		setGiaTri(sc.nextInt());
	}

	public SoNguyen(int n) {
		setGiaTri(n);

	}

	public SoNguyen Cong(SoNguyen n) {
		return new SoNguyen(GiaTri + n.getGiaTri());
	}

	public void InThongTin() {
		System.out.println(
				" Số : " + GiaTri + " là số chẵn hay không :  " + LaSoChan + " Có là số nguyên tố hay không  : "
						+ LaSoNguyenTo + "  Có là số đối xứng hay không : " + LaSoDoiXung);
	}
}
