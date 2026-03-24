package mhnhung;

public class HinhHoc {
	private String Ten;
	private String MauSac;
	public HinhHoc(String ten, String mauSac) {
		super();
		Ten = ten;
		MauSac = mauSac;
	}
	public double tinhChuVi() {
		return 0;
	}
	public double tinhDienTich() {
		return 0;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getMauSac() {
		return MauSac;
	}
	public void setMauSac(String mauSac) {
		MauSac = mauSac;
	}
	@Override
	public String toString() {
		String chuoixuat = "";
		chuoixuat = chuoixuat + "Ten: " + Ten;
		chuoixuat = chuoixuat + "\nMau sac: " + MauSac;
		return chuoixuat;

		
	}
	
	
	
}
