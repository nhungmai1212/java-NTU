package thigk2.MaiHongNhung;

public class SinhVien {
	private int mssv;
	private String hoten;
	private int namsinh;
	private String lop;
	
	public SinhVien() {
		
	}
	public SinhVien(int mssv, String hoten, int namsinh, String lop) {
		this.mssv = mssv;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.lop = lop;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	
	@Override
	public String toString() {
		String chuoixuat;
		chuoixuat =  "MSSV: " + mssv;
		chuoixuat = chuoixuat + "\nHọ và tên: " + hoten;
		chuoixuat = chuoixuat + "\nNăm sinh:  " + namsinh;
		chuoixuat = chuoixuat + "\nLop: " + lop;
		return chuoixuat;
	}


	
	
	
	
	
}
