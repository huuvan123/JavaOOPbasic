package Bai9OOP;
import java.util.*;
public class Point3D {
	private Double X,Y,Z;
	public Double getX() {
		return X;
	}
	public void setX(Double x) {
		X = x;
	}
	public Double getY() {
		return Y;
	}
	public void setY(Double y) {
		Y = y;
	}
	public Double getZ() {
		return Z;
	}
	public void setZ(Double z) {
		Z = z;
	}
	public void TinhKhoangCach() {
		
	}
	private Scanner sc=new Scanner(System.in);
     public Point3D(double a,double b, double c) {
    	X=a;
    	Y=b;
    	Z=c;
     }
     //contructer nhap lieu
     public Point3D() {
    	System.out.println("nhập x: ");
    	X=sc.nextDouble();
    	System.out.println("nhập y= ");
    	Y=sc.nextDouble();
    	System.out.println("nhập vào Z=");
    	Z=sc.nextDouble();
     }
     public Point3D(Double x, Double y, Double z) {
 		super();
 		X = x;
 		Y = y;
 		Z = z;
 	}
     // tính khoảng cách từ điểm đến 
     public double TinhKc(Point3D diem) {
    	return Math.sqrt(Math.pow(X-diem.getX(), 2) +Math.pow(Y-diem.getY(),2) +Math.pow(Z-diem.getZ(),2));
     }
     //in thông tin
     public void InThongTin() {
    System.out.println("(" + X + " "+Y+" "+Z+")"); 
     }
}
