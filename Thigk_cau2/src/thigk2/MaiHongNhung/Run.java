package thigk2.MaiHongNhung;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		ArrayList<SinhVien> ds = new ArrayList<>();
		SinhVien sv1 = new SinhVien();
		sv1.setMssv(661);
		sv1.setHoten("Mai Hong Nhung");
		sv1.setNamsinh(2006);
		sv1.setLop("CNTT3");
		System.out.println(sv1);
		ds.add(sv1);
		
		SinhVien sv2 = new SinhVien(662, "Nguyen Van A", 2005, "KTE");
		SinhVien sv3 = new SinhVien(663, "Trần Thị Hoài", 2006, "KHMT");
		ds.add(sv2);
		ds.add(sv3);
		System.out.println("Danh sách sinh viên:");
		for(SinhVien sv : ds) {
			System.out.println(sv);
		}
		
//		Scanner banphim = new Scanner(System.in);
		
	}

}
