
public class HinhChuNhat {
	private double dai;
	private double rong;
	
	public HinhChuNhat(){
		dai = 8;
		rong = 4;
	}
	
	public HinhChuNhat(double dai, double rong){
		this.dai = dai;
		this.rong = rong;
	}
	
	double getDai() {
		return dai;
	}
	double getRong() {
		return rong;
	}
	
	void setDai(double dai) {
		this.dai= dai;
	}
	void setRong(double rong) {
		this.rong= rong;
	}
	
	public String toString() {
		String S ="Hình này, có chiều dài = ";
		S = S + dai;
		S = S + " và chiều rộng = " + rong;
		return S;
	}
}
