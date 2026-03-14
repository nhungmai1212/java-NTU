package mhnhung;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		Scanner banphim = new Scanner(System.in);
		
		//Cau a,b
		for(int i = 0; i < 10; i++) {
			System.out.print("a[" + i +"] = ");
			Integer tam = banphim.nextInt();
			dsSoNguyen.add(tam);
		}
		for(Integer x: dsSoNguyen) {
			System.out.print(x + " ");
		}
		
		//Cau c
		int demChan = 0;
		for(int i = 0; i < dsSoNguyen.size(); i++) {
			if(dsSoNguyen.get(i) % 2 == 0) {
				demChan++;
			}
		}
		System.out.println("\nSo luong phan tu chan trong mang la: " + demChan);
			
		//Cau d
		int S = 0;
		for(Integer x: dsSoNguyen) {
			S += x;
		}
		System.out.println("Tong cac phan tu trong mang la: " + S);
	}

}
