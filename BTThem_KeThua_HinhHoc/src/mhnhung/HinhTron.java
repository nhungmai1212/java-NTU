package mhnhung;

public class HinhTron extends HinhHoc{
	private double BanKinh;

	public HinhTron(String Ten, String MauSac, double banKinh) {
		super(Ten, MauSac);
		BanKinh = banKinh;
	}

	public double getBanKinh() {
		return BanKinh;
	}

	public void setBanKinh(double banKinh) {
		BanKinh = banKinh;
	}
	@Override
    public double tinhChuVi() {
        return 2 * Math.PI * BanKinh;
    }
	@Override
	public double tinhDienTich() {
		return Math.PI * BanKinh * BanKinh;
	}
	@Override
	public String toString() {
		String chuoixuat = super.toString();
		chuoixuat = chuoixuat + "\nBan kinh hinh tron: " + BanKinh;
		chuoixuat = chuoixuat + "\nChu vi hinh tron: " + tinhChuVi();
		chuoixuat = chuoixuat + "\nDien tich hinh tron %. 2f: " + tinhDienTich();
		return chuoixuat;
	}
}
