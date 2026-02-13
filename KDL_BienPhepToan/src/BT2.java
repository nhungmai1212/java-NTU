
public class BT2 {

	public static void main(String[] args) {
		double weight = 44.15;
		double height = 1.58;
		
		double BMI = weight / (height * height);
		
		System.out.println("Cân nặng: " + weight + " kg");
		System.out.println("Chiều cao: " + height + " m");
		System.out.println("Chỉ số BMI: " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("-> Thiếu cân.");
		}
		else if(BMI < 25) {
			System.out.println("-> Binh thường.");
		}
		else if(BMI < 30) {
			System.out.println("-> Thừa cân.");
		}
		else {
			System.out.println("-> Béo phì.");
		}
			
	}

}
