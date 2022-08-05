package Bai20OOP;
import java.util.*;
public class TaiLieu {
      protected String MaTaiLieu;
      protected String TenTacGia;
      protected int SoBanPhatHanh;
	public String getMaTaiLieu() {
		return MaTaiLieu;
	}
	public void setMaTaiLieu(String maTaiLieu) {
		MaTaiLieu = maTaiLieu;
	}
	public String getTenTacGia() {
		return TenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		TenTacGia = tenTacGia;
	}
	public int getSoBanPhatHanh() {
		return SoBanPhatHanh;
	}
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		SoBanPhatHanh = soBanPhatHanh;
	}
	public Scanner sc=new Scanner(System.in);
	protected void Nhap() {
		System.out.println("Mã Tài Liệu , Số Bản ,Tên Tác Giả ");
		MaTaiLieu=sc.nextLine();
		SoBanPhatHanh=sc.nextInt();sc.nextLine();
		TenTacGia=sc.nextLine();
	}
	protected void InThongTin() {
		System.out.println("MÃ TÀI LIỆU : " + MaTaiLieu +" Tên Tác Giả :  " + TenTacGia +"Số Bản Phát Hành : " + SoBanPhatHanh);
	}
	public static Object TimKiem(String tenCanTim){
		return tenCanTim;
		
	}
}
		
