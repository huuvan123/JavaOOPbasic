package Bai14OOP;

import java.util.*;

public class PhanSo {
	private int TuSo;
	private int MauSo;

	public int getTuSo() {
		return TuSo;
	}

	public void setTuSo(int tuSo) {
		TuSo = tuSo;
	}

	public int getMauSo() {
		return MauSo;
	}

	public void setMauSo(int mauSo) {
		MauSo = mauSo;
	}

	private PhanSo ToiGian() {
		if (MauSo == 0)
			return null;
		int tu = TuSo, mau = MauSo;
		while (Math.abs(tu) != Math.abs(mau))
			if (Math.abs(tu) > Math.abs(mau))
				tu = Math.abs(tu) - Math.abs(mau);
			else
				mau = Math.abs(mau) - Math.abs(tu);
		return new PhanSo(TuSo / tu, MauSo / tu);
	}

	public PhanSo Cong(PhanSo ps) {
		return (new PhanSo(TuSo * ps.getMauSo() + ps.getTuSo() * MauSo, MauSo * ps.getMauSo())).ToiGian();
	}

	public PhanSo Tru(PhanSo ps) {
		return (new PhanSo(TuSo * ps.getMauSo() - ps.getTuSo() * MauSo, MauSo * ps.getMauSo())).ToiGian();
	}

	public void InThongTin() {
		System.out.println(TuSo + "/" + MauSo);

	}

	public Scanner sc = new Scanner(System.in);

	public PhanSo() {
		System.out.println("Tử Số  : ");
		TuSo = sc.nextInt();
		System.out.println("mẫu số : ");
		MauSo = sc.nextInt();
	}

	public PhanSo(int tu, int mau) {
		setTuSo(tu);
		setMauSo(mau);
	}
}
