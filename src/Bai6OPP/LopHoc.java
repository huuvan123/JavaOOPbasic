package Bai6OPP;
import java.util.*;
public class LopHoc {
   	private int MaLop;
    private String TenLop;
    private int SiSo;
    private String DiaChi;
    private String GVCN;
	public int getMaLop() {
		return MaLop;
	}
	public void setMaLop(int maLop) {
		MaLop = maLop;
	}
	public String getTenLop() {
		return TenLop;
	}
	public void setTenLop(String tenLop) {
		TenLop = tenLop;
	}
	public int getSiSo() {
		return SiSo;
	}
	public void setSiSo(int siSo) {
		SiSo = siSo;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getGVCN() {
		return GVCN;
	}
	public void setGVCN(String gVCN) {
		GVCN = gVCN;
	}
	//nhập liệu 
	public static Scanner sc=new Scanner(System.in);
	public LopHoc() {
	System.out.println("nhập vào mã lớp : ");
	MaLop =sc.nextInt();
	sc.nextLine();
	System.out.println("nhập vào tên lớp : ");
	TenLop=sc.nextLine();
	System.out.println("Sĩ Số : ");
	SiSo=sc.nextInt();
	sc.nextLine();
	System.out.println("nhập vào địa chỉ lớp : ");
	DiaChi=sc.nextLine();
	System.out.println("nhập tên giáo viên CHỦ ngiệm : ");
	GVCN=sc.nextLine();
	}
	// truyền vào 
    public LopHoc(int maLop, String tenLop, int siSo, String diaChi, String gVCN) {
			MaLop = maLop;
			TenLop = tenLop;
			SiSo = siSo;
			DiaChi = diaChi;
			GVCN = gVCN;
	}
    public void InThongTin(){
    System.out.println(" Lớp : " + TenLop + ". Có mã lớp : " + MaLop +" . Có sĩ số : " + SiSo + ". Tại địa chỉ lớp : " + DiaChi + " . Tên gvcn :" +GVCN);
    }
}
