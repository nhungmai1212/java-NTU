package mhnhung;

public class Run {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat("HCN", "Xanh", 7, 3);
		System.out.println(hcn.toString());
		
		HinhTron ht = new HinhTron("HTron", "Vang", 4);
		System.out.println(ht.toString());

	}

}
