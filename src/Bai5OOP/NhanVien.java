package Bai5OOP;
import java.util.*;
public class NhanVien {
	  private Integer MaNhanVien;
      private String HoVaTen;
      private String PhongBan;
      private String DiaChi;
      private String SoDienThoai;
	public Integer getMaNhanVien() {
		return MaNhanVien;
	}
	public void setMaNhanVien(Integer maNhanVien) {
		MaNhanVien = maNhanVien;
	}
	public String getHoVaTen() {
		return HoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		HoVaTen = hoVaTen;
	}
	public String getPhongBan() {
		return PhongBan;
	}
	public void setPhongBan(String phongBan) {
		PhongBan = phongBan;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getSoDienThoai() {
		return SoDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}
	//nhap lieu 
	private Scanner sc=new Scanner(System.in);
	public NhanVien() {
		Scanner sc= new Scanner(System.in);
		System.out.println("mã nhân viên : ");
		MaNhanVien =sc.nextInt();
		sc.nextLine();
		System.out.println("Họ Và Tên : ");
		HoVaTen=sc.nextLine();
		System.out.println("phòng ban : ");
		PhongBan=sc.nextLine();
		System.out.println("địa chỉ : ");
		DiaChi=sc.nextLine();
		System.out.println("Số điện thoại : ");
		SoDienThoai=sc.nextLine();
	}
	public void InThongTin() {
	System.out.println("Nhân viên : " + MaNhanVien + "  "+ HoVaTen +" thuộc phòng : " + PhongBan +" địa chỉ :  " + DiaChi + " Số điện thoại : "  + SoDienThoai );
	}
}
