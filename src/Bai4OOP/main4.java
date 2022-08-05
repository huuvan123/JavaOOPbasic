package Bai4OOP;
import java.util.*;
public class main4 {
	public static void main(String[] args) {
	SoThuc sc1=new SoThuc();
	System.out.println("Căn bậc N là : " + sc1.CanBacN(4));
	SoThuc sc2=new SoThuc();
	SoThuc sc3= new SoThuc();
	System.out.println("Tinh Max : " + SoThuc.TimMax(sc1, sc2, sc3).getGiaTri());
	}

}
