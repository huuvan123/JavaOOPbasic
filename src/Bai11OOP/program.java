package Bai11OOP;
import java.time.*;
public class program {
	public static void main(String[] args) {
    DonDatHang donhang =new DonDatHang();
    donhang.InThongTin();
    DonDatHang donhang1=new DonDatHang(01,LocalDate.parse("2020-01-09"),"kẹo hồ lô ",5000,2,"Giao đến TP HANOI");
    donhang1.InThongTin();
	}
}
