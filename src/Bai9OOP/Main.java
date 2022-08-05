package Bai9OOP;

public class Main {

	public static void main(String[] args) {
	//tọa độ xyz nhập liệu từ contructor
	Point3D Diem1=new Point3D();
	//diem 
	Point3D Diem2=new Point3D(3,4,5);
	Diem1.InThongTin();
	//truyền vào :tọa đọo xyz
	Point3D Diem3=new Point3D(6,7,8);
	System.out.println("khoảng cách giữa 2 điểm với mp 0xyz là : ");
	System.out.println(Diem1.TinhKc(Diem2));
	System.out.println(Diem3.TinhKc(Diem1));
	

	}

}
