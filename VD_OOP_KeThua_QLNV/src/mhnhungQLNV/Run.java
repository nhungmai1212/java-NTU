package mhnhungQLNV;

public class Run {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Mai Hong Nhung", 10000000);
		System.out.println(nv1.toString());
		
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002", "Nguyen Van A", 1500000, 3, 200000);
//		System.out.println(nvVanPhong1.toString());
		nvVanPhong1.hienthithongtin();
		

	}

}
