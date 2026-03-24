package mhnhungQLNV;

public class QuanLy extends NhanVien{
	private double PhuCapChucVu;
	private double HesoKinhNghiem;
	public QuanLy(String MaNV, String HoTen, double Luongcoban, double phuCapChucVu, double hesoKinhNghiem) {
		super(MaNV, HoTen, Luongcoban);
		PhuCapChucVu = phuCapChucVu;
		HesoKinhNghiem = hesoKinhNghiem;
	}
	
	@Override
	public double tinhLuong() {
		return (getluongcoban() * HesoKinhNghiem) + PhuCapChucVu;
	}
	@Override
	public String toString() {
		String chuoixuat = super.toString();
		chuoixuat = chuoixuat + "\nPhu cap chuc vu : " + PhuCapChucVu;
		chuoixuat = chuoixuat + "\nHe so kinh nghiem: " + HesoKinhNghiem;
		chuoixuat = chuoixuat + "\nTong luong: " + tinhLuong();
		return chuoixuat;
	}
}
