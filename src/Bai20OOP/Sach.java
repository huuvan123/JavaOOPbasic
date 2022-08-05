package Bai20OOP;
import java.util.*;
public class Sach extends TaiLieu {
        private String TenSach;
        private String TenTacGia;
        private int SoTrang;
		public String getTenSach() {
			return TenSach;
		}
		public void setTenSach(String tenSach) {
			TenSach = tenSach;
		}
		public String getTenTacGia() {
			return TenTacGia;
		}
		public void setTenTacGia(String tenTacGia) {
			TenTacGia = tenTacGia;
		}
		public int getSoTrang() {
			return SoTrang;
		}
		public void setSoTrang(int soTrang) {
			SoTrang = soTrang;
		}
		public Scanner sc=new Scanner(System.in);
		public void NhapThongTinSach() {
			Nhap();
			System.out.println(" Tên Sách :  : ");
			TenSach=sc.nextLine();
			System.out.println("Số Trang Sách : ");
			SoTrang=sc.nextInt();
			sc.nextLine();
			System.out.println(" Tên Tác Giả của sách : ");
			TenTacGia=sc.nextLine();
			
		}
		public  void InThongTinSach() {
			InThongTin();
			System.out.println("Tên sách : " + TenSach +" Tên tác gỉa : " + TenTacGia +" So Trang : "+ SoTrang +"\n ");
		}
        public static List<Sach> TimKiem(List<Sach> lst,String tenCanTim){
        	List<Sach> lst123 =new ArrayList<Sach>();
        	lst.forEach(x->{if(x.getTenSach().contains(tenCanTim))lst123.add(x);});
        	return lst123;
        }
}
