package bai1;

public class PhepToan {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println("Tong = " +(a + b));
		System.out.println("Hieu = " +(a - b));
		System.out.println("Tich = " +(a * b));
		if(b != 0) {
			System.out.println("Thuong = " +(a/(float)b));
		}
		else {
			System.out.println("khong the chia !");
		}
		
	}

}
