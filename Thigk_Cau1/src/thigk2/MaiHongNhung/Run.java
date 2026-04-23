package thigk2.MaiHongNhung;

import java.util.Scanner;

//Dùng lớp scanner nhập chiều cao và cân nặng 
//tính chỉ số BMI  = CanNang / (Chieu cao * Chieu cao)
//Dùng if để phân loại tình trạng của từng cơ thể

public class Run {

	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		
		System.out.println("Nhap chiều cao: ");
		double ChieuCao = banphim.nextDouble();
		
		System.out.println("Nhap cân nặng: ");
		double CanNang = banphim.nextDouble();
		
		double BMI = CanNang / (ChieuCao * ChieuCao);
		
		if(BMI < 18.5)
			System.out.println("Tình trạng: Gầy!");
		else if(BMI < 25)
			System.out.println("Tình trang: Bình thường!");
		else if(BMI < 30)
			System.out.println("Tình trạng: Thừa Cân!");
		else 
			System.out.println("Tình trạng: Béo phì!");
		
		System.out.println("Chỉ số BMI: " + BMI);

		
	}

}
