package mhnhung;

import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
    private List<SinhVien> danhSachSV;

    public QuanLySinhVien() {
        danhSachSV = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
        System.out.println("Đã thêm: " + sv.getHoTen());
    }

    public SinhVien timTheoMa(String maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }

    public SinhVien timDiemCaoNhat() {
        if (danhSachSV.isEmpty()) return null;
        SinhVien svCaoNhat = danhSachSV.get(0);
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() > svCaoNhat.getDiemTB()) {
                svCaoNhat = sv;
            }
        }
        return svCaoNhat;
    }

    public double tinhDiemTrungBinhLop() {
        if (danhSachSV.isEmpty()) return 0;
        double tong = 0;
        for (SinhVien sv : danhSachSV) {
            tong += sv.getDiemTB();
        }
        return tong / danhSachSV.size();
    }

    public List<SinhVien> locSinhVienTheoDiem(double diemToiThieu) {
        List<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() >= diemToiThieu) {
                ketQua.add(sv);
            }
        }
        return ketQua;
    }

    public void sapXepTheoDiem() {
        for (int i = 0; i < danhSachSV.size() - 1; i++) {
            for (int j = 0; j < danhSachSV.size() - i - 1; j++) {
                if (danhSachSV.get(j).getDiemTB() < danhSachSV.get(j + 1).getDiemTB()) {
                    SinhVien temp = danhSachSV.get(j);
                    danhSachSV.set(j, danhSachSV.get(j + 1));
                    danhSachSV.set(j + 1, temp);
                }
            }
        }
    }

    public void hienThiDanhSach() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
        System.out.printf("%-5s %-10s %-20s %-10s\n", "STT", "Mã SV", "Họ tên", "Điểm");
        System.out.println("=".repeat(50));

        for (int i = 0; i < danhSachSV.size(); i++) {
            SinhVien sv = danhSachSV.get(i);
            System.out.printf("%-5d %-10s %-20s %-10.2f\n",
                    i + 1, sv.getMaSV(), sv.getHoTen(), sv.getDiemTB());
        }
    }

    public boolean xoaSinhVien(String maSV) {
        for (int i = 0; i < danhSachSV.size(); i++) {
            if (danhSachSV.get(i).getMaSV().equals(maSV)) {
                SinhVien sv = danhSachSV.remove(i);
                System.out.println("Đã xóa: " + sv.getHoTen());
                return true;
            }
        }
        System.out.println("Không tìm thấy!");
        return false;
    }

    public void hienThiHaiSinhVienDauTien() {
        if (danhSachSV.size() >= 2) {
            List<SinhVien> sub = danhSachSV.subList(0, 2);
            System.out.println("\nHai sinh viên đầu:");
            sub.forEach(System.out::println);
        }
    }

}
