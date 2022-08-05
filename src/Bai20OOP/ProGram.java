package Bai20OOP;
import java.util.*;
public class ProGram {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
     List<Sach> lst=new ArrayList<Sach>();
     Sach sach=new Sach();
     sach.NhapThongTinSach();
     sach.InThongTinSach();
     lst.add(sach);
     Sach sach1=new Sach();
     sach1.NhapThongTinSach();
     lst.add(sach1);
     Sach sach2=new Sach();
     sach.NhapThongTinSach();
     sach.TimKiem(lst, "Truyen kieu").forEach(x->{x.InThongTinSach();});
     List<TapChi> lst2=new ArrayList<TapChi>();
     
     
	}

}
