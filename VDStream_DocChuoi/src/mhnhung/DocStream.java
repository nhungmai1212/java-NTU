package mhnhung;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fInput = new FileInputStream("Baitho.txt");
		InputStreamReader ipReader = new InputStreamReader(fInput);
		BufferedReader buReader = new BufferedReader(ipReader);
		
		String line1 = buReader.readLine();
		System.out.println(line1);
		String line2 = buReader.readLine();
		System.out.print(line2);
		
//		InputStreamReader ipReader = new InputStreamReader(System.in);
//		BufferedReader buReader = new BufferedReader(ipReader);
//		System.out.println("Nhap 1 chuoi bat ki: ");
//		String lineDocDuoc = buReader.readLine();
//		System.out.print(lineDocDuoc);
		
		
		
	}

}
