package Bai12OOP1;

import java.util.*;
import java.time.LocalDate;
import java.util.*;

public class HocVien {

	private String MaHocVien;
	private String HoTen;
	private LocalDate NgaySinh;
	private double HocPhi;
	private String Ho;
	private String Email;

	public String getMaHocVien() {
		return MaHocVien;
	}

	public void setMaHocVien(String maHocVien) {
		MaHocVien = maHocVien;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public LocalDate getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public double getHocPhi() {
		return HocPhi;
	}

	public void setHocPhi(double hocPhi) {
		if (HocPhi > 3000000) {
			HocPhi = (HocPhi * 0.95);
		}
	}

	public String getHo() {
		setHo();
		return Ho;
	}

	public void setHo() {
		Ho = HoTen.split(" ")[0];
	}

	public String getEmail() {
		setEmail();
		return Email;
	}

	private void setEmail() {
		Email = HoTen.replace(" ", "").toLowerCase() + "@edusolution.com";
	}

	private static Scanner sc = new Scanner(System.in);

	public HocVien() {
		System.out.println("Mã số : ");
		MaHocVien=sc.nextLine();
		System.out.println("Họ Tên : ");
		HoTen=sc.nextLine();
		System.out.println("Học Phí : ");
		HocPhi=sc.nextDouble();
		sc.nextLine();
		System.out.println("Ngày sinh : ");
		NgaySinh=LocalDate.parse(sc.nextLine());
	}

	public HocVien(String maHocVien, String hoTen, LocalDate ngaySinh, double hocPhi) {
		MaHocVien = maHocVien;
		HoTen = hoTen;
		NgaySinh = ngaySinh;
		HocPhi = hocPhi;
	}
	public static List<HocVien> TimKiemHocVien(List<HocVien> lst) {
		System.out.println("nhập vào tên học viên cần tìm :");
		String name = sc.nextLine();
		List<HocVien> lst123 = new ArrayList<>();
		for (HocVien i : lst)
			if (i.getHoTen().contains(name))
				lst123.add(i);
		return lst123;

	}

	public void InThongTin() {
		System.out.println(
				HoTen + " " + "Email : " + getEmail() + " Mã học viên : " + MaHocVien + "  HỌC PHÍ : " + HocPhi);
	}
}
