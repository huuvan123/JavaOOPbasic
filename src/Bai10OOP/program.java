package Bai10OOP;
import java.util.*;
import java.time.LocalDate;
public class program {
	public static void main(String[] args) {
		Nguoi nguoi1=new Nguoi();
		nguoi1.InThongTin();
        Nguoi nguoi2=new Nguoi(02,"le van nam",LocalDate.parse("2002-01-04"));
        nguoi2.InThongTin();
	}

}
