package Bai18OOP;
import java.util.Random;
import java.util.*;

public class TroChoiXucXac {
	private int GiaTri1;
	private int GiaTri2;
	private boolean Thang = false, Thua = false, Hoa = false;
	private Scanner sc = new Scanner(System.in);

	public int getGiaTri1() {
		return GiaTri1;
	}

	public void setGiaTri1(int giaTri1) {
		GiaTri1 = giaTri1;
	}

	public int getGiaTri2() {
		return GiaTri2;
	}

	public void setGiaTri2(int giaTri2) {
		GiaTri2 = giaTri2;
		if (GiaTri2 > GiaTri1) {
			Thua = true;
		} else if (GiaTri2 == GiaTri1) {
			Hoa = true;
		} else {
			Thang = true;
		}
	}

	public boolean isThang() {
		return Thang;
	}

	public boolean isThua() {
		return Thua;
	}

	public boolean isHoa() {
		return Hoa;
	}

	private int NhapGiaTri() {
		int So = 0;
		Boolean ok = false;
		do {
			try {
				System.out.println("Nhập giá trị muốn cược  :");
				So=sc.nextInt();ok=true;
			} catch (Exception e) {
				System.err.println("cần nhập số nguyên [3-30]");
				sc.nextLine();

			}
		} while (!ok);
		return So;
	}
	public void InThongTin() {
		if(Thang) System.out.println("Winner");
		else if(Thua) System.out.println("Lost ");
		else System.out.println("Hòa");	
		}

	public void BatDauChoi() {
		do{
			setGiaTri1(NhapGiaTri());
			if(getGiaTri1() < 3 || getGiaTri1() > 18) {
			System.out.println("Trò chơi kết thúc !");
			return; }
            Random rd=new Random();
            int l1=rd.nextInt(6)+1;
            int l2=rd.nextInt(6)+1;
            int l3=rd.nextInt(6)+1;
            System.out.println("Kết Quả : " + l1 +" "+ l2 +" "+ l3 +"  Tổng : " + (l1+l2+l3));
            setGiaTri2(l1+l2+l3);
            InThongTin();
            Thang=Thua=Hoa=false;
          }while(GiaTri2 >= 3 && GiaTri2 <=18);
	}
	
}
