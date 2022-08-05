package Bai4OOP;
import java.util.*;
public class SoThuc {
	private Double GiaTri;
    private Boolean LaSoDuong;
	public Double getGiaTri() {
		return GiaTri;
	}
	public void setGiaTri(Double giaTri) {
		GiaTri = giaTri;
	}
	public Boolean getLaSoDuong() {
		setLaSoDuong();
		return LaSoDuong;
	}
	public void setLaSoDuong() {
		if(GiaTri > 0) {
		LaSoDuong =true;
		}else {
		LaSoDuong=false; 
		}
	}
	public SoThuc(Double giaTri, Boolean laSoDuong) {
		GiaTri = giaTri;
		LaSoDuong = laSoDuong;
	}
	private Scanner sc=new Scanner(System.in);
	public SoThuc() {
	System.out.println("số Thực  : ");
    GiaTri=sc.nextDouble();
	}
	public static SoThuc TimMax(SoThuc a,SoThuc b,SoThuc c) {
	if(a.getGiaTri() >= b.getGiaTri() && a.getGiaTri() >= b.getGiaTri()) return a;
	if(b.getGiaTri() >= a.getGiaTri() && b.getGiaTri() >= c.getGiaTri()) return b;
	return c;
	}
	public double CanBacN(int n) {
		return Math.pow(GiaTri, 1/n);
	}
	
 }
	
   
     
