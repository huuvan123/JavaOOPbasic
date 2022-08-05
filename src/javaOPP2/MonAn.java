package javaOPP2;
import java.util.*;
public class MonAn {
	private String TenMonAn;
	private Integer GiaBan;
	private String GioiThieu;
	private String NguyenLieuChinh;
	// geter setter
	public String getTenMonAn() {
		return TenMonAn;
	}
	public void setTenMonAn(String tenMonAn) {
		TenMonAn = tenMonAn;
	}
	public Integer getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(Integer giaBan) {
		GiaBan = giaBan;
	}
	public String getGioiThieu() {
		return GioiThieu;
	}
	public void setGioiThieu(String gioiThieu) {
		GioiThieu = gioiThieu;
	}
	public String getNguyenLieuChinh() {
		return NguyenLieuChinh;
	}
	public void setNguyenLieuChinh(String nguyenLieuChinh) {
		NguyenLieuChinh = nguyenLieuChinh;
    }
	// nhập liệu 
	private Scanner sc=new Scanner(System.in);
	public MonAn() {
    System.out.println("nhập tên món ăn : ");
    TenMonAn=sc.nextLine();
    System.out.println(" giá bán : ");
    GiaBan=sc.nextInt();
    sc.nextLine();
    System.out.println("Giới thiêu : ");
    GioiThieu=sc.nextLine();
    System.out.println("NGuyên liệu chính : ");
    NguyenLieuChinh=sc.nextLine();
	}
	//in thông tin
	public void InThongTin() {
		System.out.println(TenMonAn);
		System.out.println(GiaBan);
		System.out.println(GioiThieu);
		System.out.println(NguyenLieuChinh);
		}
}
