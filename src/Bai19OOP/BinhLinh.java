package Bai19OOP;

import java.util.*;

public class BinhLinh {
	private String Ten;
	protected double SucManh = 50;
	protected Boolean TrangBi = false;

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public double getSucManh() {
		return SucManh;
	}

	public Boolean getTrangBi() {
		return TrangBi;
	}

	public void setTrangBi(Boolean trangBi) {
		TrangBi = trangBi;
		SucManh=TinhSucManh();
	}
	protected double TinhSucManh() {
	return TrangBi ? SucManh *= 1.1 : (int)SucManh;
	}
	public void InThongTin() {
		System.out.println(Ten + " co suc manh : " + SucManh);
	}
	public int ChienDau(BinhLinh Linh) {
		return SucManh < Linh.getSucManh() ? -1 :SucManh== getSucManh() ? 0:1;
	}
}
