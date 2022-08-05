package Bai16OOP;

public class program {

	public static void main(String[] args) {
	ThoiGian thoigian=new ThoiGian();
	thoigian.InThongTin();
	ThoiGian tg1=new ThoiGian(2020,4,26);
	tg1.InThongTin();
	System.out.println(thoigian.LayKhoangThoiGian(tg1));
	}

}
