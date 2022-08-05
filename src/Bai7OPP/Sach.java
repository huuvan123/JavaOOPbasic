package Bai7OPP;
import java.util.*;
import java.time.*;
public class Sach {
 private String TenSach;
 private String TheLoaiSach;
 private int Gia;
 private LocalDate NgayThang;
 private String TacGia;
public String getTenSach() {
	return TenSach;
}
public void setTenSach(String tenSach) {
	TenSach = tenSach;
}
public String getTheLoaiSach() {
	return TheLoaiSach;
}
public void setTheLoaiSach(String theLoaiSach) {
	TheLoaiSach = theLoaiSach;
}
public int getGia() {
	return Gia;
}
public void setGia(int gia) {
	Gia = gia;
}
public LocalDate  getNgayThang() {
	return NgayThang;
}
public void setNgayThang(LocalDate ngayThang) {
	NgayThang = ngayThang;
}
public String getTacGia() {
	return TacGia;
}
public void setTacGia(String tacGia) {
	TacGia = tacGia;
}
private Scanner sc=new Scanner(System.in);
public Sach() {
System.out.println("Tên Sách : ");
TenSach= sc.nextLine();
System.out.println("Thể Loại Sách :");
TheLoaiSach=sc.nextLine();
System.out.println("Giá Sách : ");
Gia=sc.nextInt();
sc.nextLine();
System.out.println("ngày suất bản : ");
setNgayThang(LocalDate.parse(sc.nextLine()));
System.out.println("nhập vào tên tác giả : ");
setTacGia(sc.nextLine());	
}
public void InThongTin() {
	System.out.println(" Tên SÁCH : " + TenSach +" THỂ LOẠI : " + TheLoaiSach +" Ngày xuất bản : " + NgayThang + " Tên tác giả : " + TacGia);
}

}
