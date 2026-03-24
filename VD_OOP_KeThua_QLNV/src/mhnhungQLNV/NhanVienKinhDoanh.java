package mhnhungQLNV;

public class NhanVienKinhDoanh extends NhanVien{
	private double DoanhSo;
	private double TyleHoaHong;
	public NhanVienKinhDoanh(String MaNV, String HoTen, double Luongcoban, double doanhSo, double tyleHoaHong) {
		super(MaNV, HoTen, Luongcoban);
		DoanhSo = doanhSo;
		TyleHoaHong = tyleHoaHong;
	}
	
	@Override
	public double tinhLuong() {
        return super.getluongcoban() + (DoanhSo * TyleHoaHong / 100);
    }
	
	@Override
	public String toString() {
		String chuoixuat = super.toString();
		chuoixuat = chuoixuat + "\nDoanh so: " + DoanhSo;
		chuoixuat = chuoixuat + "\nTy le hoa hong: " + TyleHoaHong;
		chuoixuat = chuoixuat + "\nTong luong: " + tinhLuong();
		return chuoixuat;
	}
}
