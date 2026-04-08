package mhnhung;

public class SinhVienNTU {
	private String hovaten;
	private String lop;
	public SinhVienNTU(String hovaten, String lop) {
		super();
		this.hovaten = hovaten;
		this.lop = lop;
	}
	public static String TenTruong = "Dai hoc NHA TRANG";
	public static void SayHi() {
		System.out.println("Toi la sinh vien NTU");
	}
	
	public void SayHello() {
		System.out.println("Hello, toi la sinh vien NTU: \nTen:" + hovaten + "Lop:" + lop);
		
	}

	public String getHovaten() {
		return hovaten;
	}

	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public static String getTenTruong() {
		return TenTruong;
	}

	public static void setTenTruong(String tenTruong) {
		TenTruong = tenTruong;
	}
	
	
}
