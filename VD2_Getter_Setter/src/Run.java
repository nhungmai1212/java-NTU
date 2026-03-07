
public class Run {

	public static void main(String[] args) {
		HinhChuNhat cn1 = new HinhChuNhat();
		
		HinhChuNhat cn2 = new HinhChuNhat(15,10);
		HinhChuNhat hv = new HinhChuNhat(12,12);
		
		double cn1_dai= cn1.getDai();
		double cn1_rong= cn1.getRong();
		   
		System.out.print("Hình CN1 có chiều dài là : ");
		System.out.print(cn1_dai);
		System.out.println("\nHình CN1 có chiều rộng là : " + cn1_rong);
		
		cn1.setDai(25);
		System.out.print("Sau khi thay đổi chiều dài: \n");
		cn1_dai= cn1.getDai();
		cn1_rong= cn1.getRong();
		System.out.print("Hình CN1 có chiều dài là : ");
		System.out.print(cn1_dai);
		System.out.println("\nHình CN1 có chiều rộng là : " + cn1_rong);

		System.out.print(cn1.toString() );
	}
	
	

}
