package Bai12OOP1;
import java.time.*;
import java.util.*;
import java.util.ArrayList;
public class program {
	public static void main(String[] args) {
	HocVien hv=new HocVien();
	hv.InThongTin();
	List<HocVien> lst=new ArrayList<HocVien>();
	lst.add(hv);
	lst.add(new HocVien());
	lst.add(new HocVien());
	List<HocVien> lst123=HocVien.TimKiemHocVien(lst);
	for(HocVien i : lst123) {
		i.InThongTin();
	}

	}

}
