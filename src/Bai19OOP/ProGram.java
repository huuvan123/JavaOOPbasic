package Bai19OOP;

public class ProGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BinhLinh bl1=new BinhLinh();
      bl1.setTen("LÍNH 1 ");
      bl1.setTrangBi(false);
      bl1.InThongTin();
      BinhLinh bl2=new BinhLinh();
      bl2.setTen("Lính 2 ");
      bl2.setTrangBi(true);
      bl2.InThongTin();
      CungThu cungthu=new CungThu();
      cungthu.setTen("hảo cung thần : ");
      cungthu.setTrangBi(true);
      cungthu.InThongTin();
      DauSi dausi=new  DauSi();
      dausi.setTen("đấu sĩ 1 : ");
      dausi.setTrangBi(true);
      dausi.InThongTin();
      KiemSi kiemsi=new KiemSi();
      kiemsi.setTen("lệnh hồ xung : ");
      kiemsi.setTrangBi(true);
      kiemsi.InThongTin();
      System.out.println(cungthu.ChienDau(dausi));
	}

}
