package mhnhung;

public class Run {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(25));
		
		System.out.println(SinhVienNTU.TenTruong);
		SinhVienNTU.SayHi();
		
		SinhVienNTU sv1 = new SinhVienNTU("Mai Hong Nhung", "CNTT");
		SinhVienNTU sv2 = new SinhVienNTU("Nguyen Van A", "KTE");
		
		sv1.SayHello();
		sv2.SayHello();
	}

}
