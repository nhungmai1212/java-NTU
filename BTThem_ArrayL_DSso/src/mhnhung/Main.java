package mhnhung;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> danhsachso = new ArrayList<Integer>();
		Scanner banphim = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("a[" + i +  "] = ");
			Integer tam = banphim.nextInt();
			danhsachso.add(tam);
		}
		
		ArrayList<Integer> danhsachsomoi = new ArrayList<Integer>();
		for(int i = 0; i < danhsachso.size(); i++) {
			int giatri = danhsachso.get(i);
			if(!danhsachsomoi.contains(giatri)) {
				danhsachsomoi.add(giatri);
			}
		}
		System.out.println("Danh sach sau khi xoa trung: " + danhsachsomoi);
		
		int max1 = danhsachso.get(0);
		for(Integer x: danhsachso) {
			int giatri = x;
			if(giatri > max1) max1 = giatri;
		}
		int max2 = danhsachso.get(0);
		for(Integer x: danhsachso) {
			int giatri = x;
			if(giatri > max2 && giatri <max1) max2 = giatri;
		}
		System.out.println("so lon thu 2: " + max2);
		
		double S = 0;
		int dem = 0;
		for(Integer x: danhsachso) {
			if(x % 2 == 0) {
				S += x;
				dem++;
			}
		}
		double TB = S / dem;
		System.out.println("Tong trung binh so chan: " + TB);
		
		ArrayList<Integer> SoChan = new ArrayList<Integer>();
		ArrayList<Integer> SoLe = new ArrayList<Integer>();
		for(Integer x: danhsachso) {
			if(x % 2 == 0) SoChan.add(x);
			else SoLe.add(x);
		}
		System.out.println("Danh sach so chan:" + SoChan);
		System.out.println("Danh sach so le: " + SoLe);
		
		ArrayList<Integer> danhsachnguoc = new ArrayList<Integer>();
		for(int i = danhsachso.size()-1; i >= 0; i--) {
			danhsachnguoc.add(danhsachso.get(i));
		}
		System.out.println("Danh sach sau khi dao nguoc: " + danhsachnguoc);
	}
	
	

}
