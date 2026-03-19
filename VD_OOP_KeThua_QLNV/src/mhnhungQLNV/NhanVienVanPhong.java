package mhnhungQLNV;

public class NhanVienVanPhong extends NhanVien{
	private double SoGiolamthem;
	private double LuongThemmoigio;
	
	public NhanVienVanPhong(String MaNV, String HoTen, double Luongcoban, double soGiolamthem, double luongThemmoigio) {
		super(MaNV, HoTen, Luongcoban);
		this.SoGiolamthem = soGiolamthem;
		this.LuongThemmoigio = luongThemmoigio;
	}
	
	@Override
	public double tinhLuong() {
		return super.getluongcoban() + SoGiolamthem * LuongThemmoigio;
	}
	
	@Override
	public void hienthithongtin() {
		super.hienthithongtin();
		System.out.println("So gio lam them: " + SoGiolamthem);
		System.out.println("Luong cho moi gio lam them: " + LuongThemmoigio);
		System.out.println("Luong duoc nhan: " + tinhLuong());
	}

	@Override
	public String toString() {
		String chuoiXuat=super.toString();
		chuoiXuat = chuoiXuat + "\nSố giờ làm thêm : " + SoGiolamthem;
		chuoiXuat = chuoiXuat + "\nLương cho mỗi giờ làm thêm : " + LuongThemmoigio;
		chuoiXuat = chuoiXuat + "\nLương được nhận: " + tinhLuong();
		return chuoiXuat;
	}
	
	
	
}
