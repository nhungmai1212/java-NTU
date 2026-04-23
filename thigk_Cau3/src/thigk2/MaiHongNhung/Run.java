package thigk2.MaiHongNhung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {

        ArrayList<Integer> ds = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                int so = Integer.parseInt(line);
                ds.add(so);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
        System.out.println("Danh sách số nguyên:");
        for (int x : ds) {
            System.out.print(x + " ");
        }

        System.out.println("\n");
        String mssv = "661";
        int X = Character.getNumericValue(mssv.charAt(mssv.length() - 1));

        System.out.println("X = " + X);
        boolean found = false;

        for (int num : ds) {
            if (num == X) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("X có trong danh sách!");
        } else {
            System.out.println("X không có trong danh sách!");
        }
    }
}}
}