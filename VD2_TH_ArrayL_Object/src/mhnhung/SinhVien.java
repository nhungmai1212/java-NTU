package mhnhung;

public class SinhVien {
	private String maSV;
    private String hoTen;
    private double diemTB;
    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    public String getMaSV() { 
    	return maSV; 
    }
    public String getHoTen() { 
    	return hoTen; 
    }
    public double getDiemTB() { 
    	return diemTB; 
    }
    public String toString() {
        return String.format("Mã: %s, Họ tên: %s co Điểm TB: %.2f",maSV, hoTen, diemTB);
    }
}
