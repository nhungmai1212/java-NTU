package mhnhung;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		HocSinh hs1 = new HocSinh();
		hs1.setTenHS("Mai Hong Nhung");
		short tuoihs1 = 21;
		hs1.setTuoiHS(tuoihs1);
		hs1.setLopHS("CNTT");
		
		HocSinh hs2 = new HocSinh("Nguyen Hong Nhung", (short)20, "KTE");
		System.out.println(hs1.toString());
		System.out.println(hs2.toString());
		
		Scanner banphim = new Scanner(System.in);
		HocSinh hs3 = new HocSinh();
		System.out.print("\nNhap ten HS3: ");
		String tenhs3 = banphim.nextLine();
		hs3.setTenHS(tenhs3);
		
		System.out.print("Nhap tuoi HS3: ");
		short tuoihs3 = banphim.nextShort();
		hs3.setTuoiHS(tuoihs3);
		banphim.nextLine();
		
		System.out.print("Nhap lop HS3: ");
		String lophs3 = banphim.nextLine();
		hs3.setLopHS(lophs3);
		System.out.print(hs3.toString());
		
		ArrayList<HocSinh>  dsHocSinh = new ArrayList<HocSinh>();
		int N = 3;
		for(int i = 0; i < N; i++) {
			HocSinh hsi = new HocSinh();
			System.out.print("\nNhap ten HS thu " + i);
			String tenhsi = banphim.nextLine();
			hsi.setTenHS(tenhsi);
			
			System.out.print("Nhap tuoi HS thu " + i);
			short tuoihsi = banphim.nextShort();
			banphim.nextLine();
			hsi.setTuoiHS(tuoihsi);
			
			System.out.print("Nhap lop HS thu " + i);
			String lophsi = banphim.nextLine();
			hsi.setLopHS(lophsi);
			dsHocSinh.add(hsi);
		}
		for(int i = 0; i < N; i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		
		HocSinh BShs = new HocSinh();
		System.out.print("\nThem moi 1 ten hoc sinh: ");
		String BSten = banphim.nextLine();
		BShs.setTenHS(BSten);
		
		System.out.print("Them moi 1 tuoi hoc sinh: ");
		short BStuoi = banphim.nextShort();
		banphim.nextLine();
		BShs.setTuoiHS(BStuoi);
		
		System.out.print("Them moi 1 lop hoc sinh: ");
		String BSlop = banphim.nextLine();
		BShs.setLopHS(BSten);
		dsHocSinh.add(BShs);
		for(HocSinh x : dsHocSinh) {
			System.out.println(x);
		}
		
		dsHocSinh.removeIf(hs -> hs.getTenHS().equals("Hoa"));
		
		for(HocSinh x : dsHocSinh) {
			System.out.println(x);
		}
	}

}
