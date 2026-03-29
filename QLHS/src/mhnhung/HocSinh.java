package mhnhung;

public class HocSinh {
	private String TenHS;
	private short TuoiHS;
	private String LopHS;
	
	public HocSinh() {
		
	}

	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		TenHS = tenHS;
		TuoiHS = tuoiHS;
		LopHS = lopHS;
	}

	public String getTenHS() {
		return TenHS;
	}

	public void setTenHS(String tenHS) {
		TenHS = tenHS;
	}

	public short getTuoiHS() {
		return TuoiHS;
	}

	public void setTuoiHS(short tuoiHS) {
		TuoiHS = tuoiHS;
	}

	public String getLopHS() {
		return LopHS;
	}

	public void setLopHS(String lopHS) {
		LopHS = lopHS;
	}

	@Override
	public String toString() {
		String chuoixuat;
		chuoixuat = "\nHo va ten: " + TenHS;
		chuoixuat = chuoixuat + "\nTuoi HS: " + TuoiHS;
		chuoixuat = chuoixuat + "\nLop HS: " + LopHS;
		return chuoixuat;
	}
	
	
		
}
