import java.util.Scanner;
public class TinhTong2So {

	public static void main(String[] args) {
		
		double num1, num2, S;
		Scanner dulieu = new Scanner(System.in);
		
		System.out.print("Nhap so thu 1: ");
		num1 = dulieu.nextDouble();
		
		System.out.print("Nhap so thu 2: ");
		num2 = dulieu.nextDouble();
		
		S = num1 + num2;
		System.out.printf("Tong %.2f va %.2f la: %.2f ", num1, num2, S);
	}

}
