package thigk2.MaiHongNhung;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
//Tao lớp tên SinhVien chứa massv, hoten, namsinh, lop
//Tạo hàm constructor, get-set
//Nhập dữ liệu 3 sinh viên bằng hard-code vào main - in ra
//Thêm mới 1 sv bằng cách nhập dữ liệu từ bàn phím- in lại danh sách

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
		
		Scanner banphim = new Scanner(System.in);
		SinhVien sv4 = new SinhVien();
		System.out.println("\nNhap MSSV: ");
		int MSSVsv4 = banphim.nextInt();
		banphim.nextLine();
		sv4.setMssv(MSSVsv4);

		System.out.println("\nNhap Họ và tên: ");
		String HoTensv4 = banphim.nextLine();
		sv4.setHoten(HoTensv4);
		

		System.out.println("\nNhap năm sinh: ");
		int NSsv4 = banphim.nextInt();
		sv4.setNamsinh(NSsv4);
		banphim.nextLine();

		System.out.println("\nNhap lớp: ");
		String Lopsv4 = banphim.nextLine();
		sv4.setLop(Lopsv4);
		ds.add(sv4);
		
		System.out.println("Danh sách sinh viên sau khi thêm mới 1 sinh viên:");
		for(SinhVien sv : ds) {
			System.out.println(sv);
		}
		
		int namHienTai = LocalDate.now().getYear();

        System.out.println("\nDanh sách sinh viên > 20 tuổi:");

        for (SinhVien sv : ds) {
            int tuoi = namHienTai - sv.getNamsinh();

            if (tuoi > 20) {
                System.out.println(sv);
                System.out.println("Tuổi: " + tuoi);
                System.out.println("-------------------");
            }
        }
	}

}
