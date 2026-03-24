package mhnhung;

public class HinhChuNhat extends HinhHoc{
	private double chieuDai;
	private double chieuRong;
	public HinhChuNhat(String Ten, String MauSac, double chieuDai, double chieuRong) {
		super(Ten, MauSac);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	@Override
	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}

	@Override
	public double tinhChuVi() {
	    return 2 * (chieuDai + chieuRong);
	}
	@Override
	public String toString() {
		String chuoixuat = super.toString();
		chuoixuat = chuoixuat + "\nChieu dai hinh chu nhat: " + chieuDai;
		chuoixuat = chuoixuat + "\nChieu Rong hinh chu nhat: " + chieuRong;
		chuoixuat = chuoixuat + "\nChu vi hinh chu nhat: " + tinhChuVi();
		chuoixuat = chuoixuat + "\nDien tich hinh chu nhat: " + tinhDienTich();
		return chuoixuat;
	}
}
