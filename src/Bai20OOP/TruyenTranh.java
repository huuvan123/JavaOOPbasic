package Bai20OOP;
import java.util.*;
import java.time.*;
public class TruyenTranh extends TaiLieu {
        private String TenTruyen;
        private int NgayPhatHanh;
		public String getTenTruyen() {
			return TenTruyen;
		}
		public void setTenTruyen(String tenTruyen) {
			TenTruyen = tenTruyen;
		}
		public int getNgayPhatHanh() {
			return NgayPhatHanh;
		}
		public void setNgayPhatHanh(int ngayPhatHanh) {
			NgayPhatHanh = ngayPhatHanh;
		}public Scanner sc=new Scanner(System.in);
		public void NhapThongTinTruyenTranh() {
			Nhap();
			System.out.println("Ngay Phat Hanh truyen tranh : ");
			NgayPhatHanh=sc.nextInt();
			System.out.println(" Ten Truyen Tranh : ");
			TenTruyen=sc.nextLine();
		}
		public  void InThongTinTruyenTranh() {
			InThongTin();
			System.out.println("Tên Truyen : " + TenTruyen + "Ngay Phat Hanh"+ NgayPhatHanh);
		}
        public static List<TruyenTranh> TimKiem(List<TruyenTranh> lst,String tenCanTim){
        	List<TruyenTranh> lst123 =new ArrayList<TruyenTranh>();
        	lst.forEach(x->{if(x.getTenTruyen().contains(tenCanTim))lst123.add(x);});
        	return lst123;
        }
}
