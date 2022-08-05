package Bai20OOP;

import java.util.*;
import java.time.*;

public class TapChi extends TaiLieu {
	private String TenTapChi;
	private int SoPhatHanh, ThangPhatHanh;

	public String getTenTapChi() {
		return TenTapChi;
	}

	public void setTenTapChi(String tenTapChi) {
		TenTapChi = tenTapChi;
	}

	public int getSoPhatHanh() {
		return SoPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		SoPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return ThangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		ThangPhatHanh = thangPhatHanh;
	}

	public Scanner sc = new Scanner(System.in);

	public void NhapThongTinTapChi() {
		Nhap();
		System.out.println(" Số bản phát hành tạp chí  : ");
		SoPhatHanh = sc.nextInt();
		System.out.println(" Tháng Phát Hành Tạp chí  : ");
		ThangPhatHanh = sc.nextInt();sc.nextLine();
		System.out.println(" Tên Tạp Chí : ");
		TenTapChi = sc.nextLine();
	}

	public void InThongTinTapChi() {
    System.out.println("name : " + TenTapChi + "So phat Hanh" + SoPhatHanh+ "Thang Phat Hanh " +ThangPhatHanh);
	}
	  public static List<TapChi> TimKiemTapChi(List<TapChi> lst,String tenCanTim){
      	List<TapChi> lst123 =new ArrayList<TapChi>();
      	lst.forEach(x->{if(x.getTenTapChi().contains(tenCanTim))lst123.add(x);});
      	return lst123;
      }
}
