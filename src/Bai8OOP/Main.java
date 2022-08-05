package Bai8OOP;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HocSinh  hs1= new HocSinh();
      hs1.InThongTin();
      HocSinh hs2=new HocSinh("Lê Nam Văn","DCCTCT65A",LocalDate.parse("2002-01-05"), 8.1, 9.2, 9.3);
      hs2.InThongTin();
	}

}
