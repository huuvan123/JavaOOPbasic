package Bai10OOP;
import java.util.*;
import java.time.*;

public class Nguoi {
	private int MaSo;
	private String HoTen, Ho, Dem, Ten;
	private LocalDate NgayThang;

	public int getMaSo() {
		return MaSo;
	}

	public void setMaSo(int maSo) {
		MaSo = maSo;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getHo() {
		setHoDemTen();
		return Ho;
	}

	public String getDem() {
		setHoDemTen();
		return Dem;
	}

	public String getTen() {
		setHoDemTen();
		return Ten;
	}

	public LocalDate getNgayThang() {
		return NgayThang;
	}

	public void setNgayThang(LocalDate ngayThang) {
		NgayThang = ngayThang;
	}

	private String str;

	public void setHoDemTen() {
		String[] str = HoTen.split("  ");
		Ho = str[0];
		Ten = str[str.length - 1];
		Dem = "  ";
		for (int i = 1; i < str.length - 1; i++) {
			Dem += str[i] + "  ";
		}
	}

	private String TaoDuLieu(String ht) {
		if (HoTen == null || ht.compareTo(HoTen) != 0)
			return ht;
		return HoTen;
	}

	public Scanner sc = new Scanner(System.in);

	public Nguoi() {
		System.out.println("MA So : ");
		MaSo = sc.nextInt();
		sc.nextLine();
		System.out.println("Ho Ten");
		HoTen = TaoDuLieu(sc.nextLine());
		System.out.println("nhập vào ngày tháng : ");
		NgayThang = LocalDate.parse(sc.nextLine());
	}
	public Nguoi(int maSo, String hoTen, LocalDate ngayThang) {
		super();
		MaSo = maSo;
		HoTen = hoTen;
		NgayThang = ngayThang;
	}

	public void InThongTin() {
	System.out.println("mã số : " + MaSo + "  HỌ TÊN " + HoTen + "  NgayThang : " + NgayThang);
	
	}
}
