package Bai16OOP;

import java.util.*;
import java.time.LocalDate;

public class ThoiGian {
	private int Ngay, Thang, Nam;
	private Boolean LaNamNhuan;
	Calendar c = Calendar.getInstance();
	private int Thu;

	public int getNgay() {
		setNgay(Ngay);
		return Ngay;
	}

	public void setNgay(int ngay) {
		Ngay = ngay;
		c.set(Nam, Thang-1, Ngay);
		Thu = c.get(Calendar.DAY_OF_WEEK);
	}

	public int getThang() {
		return Thang;
	}

	public void setThang(int thang) {
		Thang = thang;
	}

	public int getNam() {
		return Nam;
	}

	public void setNam(int nam) {
		Nam = nam;
		if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
			LaNamNhuan = true;
		} else {
			LaNamNhuan = false;
		}
	}

	public Boolean getLaNamNhuan() {
		return LaNamNhuan;
	}

	public int getThu() {
		return Thu;
	}

	private Scanner sc = new Scanner(System.in);

	private int NhapNam(String msgnhap, String msgloi, int min, int max) {
		boolean ok = false;
		int so = 0;
		do {
			try {
				System.out.println(msgnhap);
				so = sc.nextInt();
				ok = true;
				ok = ok && so >= min && so <= max;
			} catch (Exception e) {
				System.out.println(msgloi);
				sc.nextLine();
			}
		} while (!ok);
		return so;
	}

	public ThoiGian( int Nam, int Thang, int Ngay) {
		setNam(Nam);
		setThang(Thang);
		setNgay(Ngay);
	
	}

	public ThoiGian() {
		setNam(NhapNam("nhập vào năm : ", "trong khoảng so nguyen [1000-2100]", 1000, c.get(Calendar.YEAR)));
		setThang(NhapNam("nhập vào tháng : ", "trong khoảng so nguyen [1-12]", 0, 12));
		if (Thang == 2) {
			if (LaNamNhuan)
				setNgay(NhapNam("Nhap vao ngay : ", "Trong khoang 1-29", 1, 29));
			else
				setNgay(NhapNam("Nhap vao ngay : ", "Trong khoang 1-28", 1, 28));
		} else if (Thang == 4 || Thang == 6 || Thang == 9 || Thang == 11) {
			setNgay(NhapNam("Nhap vao ngay : ", "Trong khoang 1-30", 1, 30));
		} else {
			setNgay(NhapNam("Nhap vao ngay : ", "Trong khoang 1-31", 1, 31));
		}
	}
	public long LayKhoangThoiGian(ThoiGian tg) {
		Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		c1.set(Nam,Thang-1,Ngay);
		c2.set(tg.getNam(), tg.getThang()-1,tg.getNgay());
		long n=Math.abs((c1.getTimeInMillis()-c2.getTimeInMillis())/(24*60*60*1000));
		return n;
	}

	public void InThongTin() {
		System.out.println("Thứ  : " + Thu + " Ngày : " + Ngay + "/" + Thang + "/" + Nam
				+ " Là năm nhuân : " + LaNamNhuan);
	}

}
