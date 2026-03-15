package mhnhung;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCoBan {

	public static void main(String[] args) {
		List<String> danhsachten  = new ArrayList<>();
		
		System.out.println("---Them phan tu---");
		danhsachten.add("Mai Hong Nhung");
		danhsachten.add("Nhung Hong Mai");
		
		danhsachten.add(1, "ntu");
		System.out.println("Danh sach sau khi them: " + danhsachten);
		
		System.out.println("---Kich thuoc phan tu---");
		System.out.println("So phan tu: " + danhsachten.size());
		
		System.out.println("---Truy cap phan tu---");
		System.out.println("Phan tu thu 0: " + danhsachten.get(0));
		System.out.println("Phan tu thu 2: " + danhsachten.get(2));
		
		System.out.println("---Cap nhat phan tu---");
		System.out.println("Truoc khi cap nhat: " + danhsachten.get(2));
		danhsachten.set(2, "Nguyen Van A");
		System.out.println("Sau khi cap nhat: " + danhsachten.get(2));
		
		System.out.println("---Tim kiem---");
		System.out.println("Co 'Nguyen Van A' ko ? - " + danhsachten.contains("Nguyen Van A"));
		System.out.println("Vi tri cua 'Nguyen Van A': " + danhsachten.indexOf("Nguyen van A"));
		System.out.println("Vi tri cu 'khong ton tai': " + danhsachten.indexOf("khong ton tai"));
		
		System.out.println("---Xoa phan tu---");
		System.out.println("Truoc khi xoa: " + danhsachten);
		System.out.println();
		
		System.out.println("---Xoa theo chi so---");
		String removedByIndex = danhsachten.remove(0);
        System.out.println("Đã xóa (theo index 0): " + removedByIndex);

        System.out.println("---Xoa theo doi tuong---");
        boolean removedByOject = danhsachten.remove("Nguyen Van A");
        System.out.println("Sau khi xoa: " + danhsachten);
        
        System.out.println("---Kiem tra rong---");
        System.out.println("Danh sach co rong ko ? -" + danhsachten.isEmpty());
        
        System.out.println("---Duyet danh sach---");
        System.out.println("--Cach nguyen thuy--");
        for(int i = 0; i < danhsachten.size(); i++) {
        	System.out.println("Vi tri " + i + ": " + danhsachten.get(i));
        	
        }
        System.out.println("--C2--");
        for(String ten: danhsachten) {
        	System.out.println("Ten: " + ten);
        }
        
        System.out.println("---Xoa toan bo---");
        danhsachten.clear();
        System.out.println("Sau khi clear, kich thuoc mang: " + danhsachten.size());
	}
}
