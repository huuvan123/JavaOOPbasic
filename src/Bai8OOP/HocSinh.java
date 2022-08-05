package Bai8OOP;
import java.util.*;
import java.time.*;
public class HocSinh {
	  private String HoTen,Lop;
      private LocalDate NgaySinh;
      private Double DiemToan,DiemVan,DiemAnh;
      private Double DiemTrungBinh;
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	public LocalDate getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public Double getDiemToan() {
		return DiemToan;
	}
	public void setDiemToan(Double diemToan) {
		DiemToan = diemToan;
	}
	public Double getDiemVan() {
		return DiemVan;
	}
	public void setDiemVan(Double diemVan) {
		DiemVan = diemVan;
	}
	public Double getDiemAnh() {
		return DiemAnh;
	}
	public void setDiemAnh(Double diemAnh) {
		DiemAnh = diemAnh;
	}
	public  Double getDiemTrungBinh() {
		return DiemTrungBinh;
	}
	private void setDiemTrungBinh() {
		DiemTrungBinh =(DiemToan + DiemVan+ DiemAnh)/3;
	}
	private Scanner sc=new Scanner(System.in);
	//nhâp liệu 
	public HocSinh() {
	System.out.println("Họ Và Tên : ");
	HoTen=sc.nextLine();
	System.out.println(" Lớp : ");
	Lop=sc.nextLine();
	System.out.println("Ngày Sinh : ");
	NgaySinh=LocalDate.parse(sc.nextLine());
	System.out.println("Điểm Toán Văn Anh ");
	DiemToan=sc.nextDouble();
	DiemVan=sc.nextDouble();
	DiemAnh=sc.nextDouble();
	}
	//truyền vào 
	public HocSinh(String hoTen, String lop, LocalDate ngaySinh, Double diemToan, Double diemVan, Double diemAnh) {
		HoTen = hoTen;
		Lop = lop;
		NgaySinh = ngaySinh;
		DiemToan = diemToan;
		DiemVan = diemVan;
		DiemAnh = diemAnh;
	}
	public void InThongTin() {
	setDiemTrungBinh();
	System.out.println("Họ Va Tên :  " + HoTen + " Lớp : " + Lop + "   Ngày Sinh : " + NgaySinh+ "  Điểm trung bình : " + DiemTrungBinh);
	
	}
	

}
