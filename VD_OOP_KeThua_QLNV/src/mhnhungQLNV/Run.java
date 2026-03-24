package mhnhungQLNV;

public class Run {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Mai Hong Nhung", 10000000);
		System.out.println(nv1.toString());
		
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002", "Nguyen Hong Nhung", 1500000, 3, 200000);
//		System.out.println(nvVanPhong1.toString());
		nvVanPhong1.hienthithongtin();
		
		QuanLy nvQuanLy1 = new QuanLy("003", "Le Hong Nhung", 2000000, 300000, 1.5);
		System.out.println(nvQuanLy1.toString());
		
		NhanVienKinhDoanh nvKinhDoanh = new NhanVienKinhDoanh("004", "Bui Hong Nhung", 3000000, 7000000, 5);
		System.out.println(nvKinhDoanh.toString());
	}

}
