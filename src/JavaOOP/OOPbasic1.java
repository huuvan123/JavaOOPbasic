package JavaOOP;

public class OOPbasic1 {
	
	private Integer MaSoSanPham;
	private String TenSanPham;
	private String LoaiSanPham;
	private Boolean LaSanPhamMoi;

	public Integer getMaSoSanPham() {
		return MaSoSanPham;
	}

	public void setMaSoSanPham(Integer maSoSanPham) {
		MaSoSanPham = maSoSanPham;
	}

	public String getTenSanPham() {
		return TenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		TenSanPham = tenSanPham;
	}

	public String getLoaiSanPham() {
		return LoaiSanPham;
	}

	public void setLoaiSanPham(String loaiSanPham) {
		LoaiSanPham = loaiSanPham;
	}

	public Boolean getLaSanPhamMoi() {
		return LaSanPhamMoi;
	}

	public void setLaSanPhamMoi(Boolean laSanPhamMoi) {
		LaSanPhamMoi = laSanPhamMoi;
	}
	public OOPbasic1() {
		
	}
	public OOPbasic1(Integer maSoSanPham, String tenSanPham, String loaiSanPham, Boolean laSanPhamMoi) {
		MaSoSanPham = maSoSanPham;
		TenSanPham = tenSanPham;
		LoaiSanPham = loaiSanPham;
		LaSanPhamMoi = laSanPhamMoi;
	}

	public void Inthongtin() {
		System.out.println("mã số sản phẩm " + MaSoSanPham + "     tên sản phẩm : " + TenSanPham + "    loại sản phẩm "
				+ LoaiSanPham + "  Là Sản phẩm mới " + LaSanPhamMoi);

	}
	
}
