package Bai11OOP;
import java.util.*;
import java.time.*;
public class DonDatHang {
	private int MaSoDon;
	private LocalDate NgayDat;
	private String TenSanPham;
	private double DonGia;
	private int Soluong;
	private double ThanhTien;
	private String GhiChu;

	public int getMaSoDon() {
		return MaSoDon;
	}

	public void setMaSoDon(int maSoDon) {
		MaSoDon = maSoDon;
	}

	public LocalDate getNgayDat() {
		return NgayDat;
	}

	public void setNgayDat(LocalDate ngayDat) {
		NgayDat = ngayDat;
	}

	public String getTenSanPham() {
		return TenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		TenSanPham = tenSanPham;
	}

	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia) {
		DonGia = donGia;
	}

	public int getSoluong() {
		return Soluong;
	}

	public void setSoluong(int soluong) {
		Soluong = soluong;
	}

	public double getThanhTien() {
		setThanhTien();
		return ThanhTien;
	}

	private double setThanhTien() {
		return ThanhTien = (DonGia * Soluong);
	}

	public String getGhiChu() {
		return GhiChu;
	}

	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}

	private Scanner sc = new Scanner(System.in);

	public DonDatHang() {
		System.out.println("Mã đơn : ");
		MaSoDon = sc.nextInt();
		sc.nextLine();
		System.out.println("Ngày đặt hàng : ");
		NgayDat = LocalDate.parse(sc.nextLine());
		System.out.println("Tên SP : ");
		TenSanPham = sc.nextLine();
		System.out.println("Đơn Giá : ");
		DonGia = sc.nextDouble();
		System.out.println("Số lượng : ");
		Soluong = sc.nextInt();
		sc.nextLine();
		System.out.println("Ghi chú : ");
		GhiChu = sc.nextLine();

	}

	public DonDatHang(int maSoDon, LocalDate ngayDat, String tenSanPham, double donGia, int soluong, String ghiChu) {
		MaSoDon = maSoDon;
		NgayDat = ngayDat;
		TenSanPham = tenSanPham;
		DonGia = donGia;
		Soluong = soluong;
		GhiChu = ghiChu;
	}

	public void InThongTin() {
		setThanhTien();
		System.out.println("Mã đơn : " + MaSoDon + " Tên : " + TenSanPham + " Ngày đặt : " + NgayDat + "  Số lượng : "
				+ Soluong + "  Tổng tiền là : " + ThanhTien + " "  +GhiChu);

	}

}
