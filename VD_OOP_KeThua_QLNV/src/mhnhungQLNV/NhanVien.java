package mhnhungQLNV;

public class NhanVien {
	private String MaNV;
	private String HoTen;
	private double Luongcoban;
	

	public NhanVien(String maNV, String hoTen, double luongcoban) {
		super();
		this.MaNV = maNV;
		this.HoTen = hoTen;
		this.Luongcoban = luongcoban;
	}
	public NhanVien() {
		super();
	}
	
	public double tinhLuong() {
		return Luongcoban;
	}
	@Override
	public String toString() {
		String chuoixuat = "";
		chuoixuat = chuoixuat + "Ma NV: " + this.MaNV;
		chuoixuat = chuoixuat + "\nHo ten: " + this.HoTen;
		chuoixuat = chuoixuat + "\nLuong co ban: " + this.Luongcoban;
		return chuoixuat;
//		return "NhanVien [MaNV=" + MaNV + ", HoTen=" + HoTen + ", Luongcoban=" + Luongcoban + "]";
	}
	public void hienthithongtin() {
		System.out.println("Ma NV: " + MaNV);
		System.out.println("Ho ten: " + HoTen);
		System.out.println("Luong co ban: " + Luongcoban);
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public double getluongcoban() {
		return Luongcoban;
	}
	public void setLuongcoban(double luongcoban) {
		Luongcoban = luongcoban;
	}
	
	
}
