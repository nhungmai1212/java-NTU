package mhnhung;

public class MainQuanLysSinhVien {

	public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();

        ql.themSinhVien(new SinhVien("SV001", "Nguyễn Văn A", 8.5));
        ql.themSinhVien(new SinhVien("SV002", "Trần Thị B", 7.2));
        ql.themSinhVien(new SinhVien("SV003", "Lê Văn C", 6.8));
        ql.themSinhVien(new SinhVien("SV004", "Phạm Thị D", 9.1));
        ql.themSinhVien(new SinhVien("SV005", "Hoàng Văn E", 5.5));

        ql.hienThiDanhSach();

        System.out.println("\nTìm SV003:");
        System.out.println(ql.timTheoMa("SV003"));

        System.out.println("\nSinh viên điểm cao nhất:");
        System.out.println(ql.timDiemCaoNhat());

        System.out.println("\nĐiểm TB lớp:");
        System.out.printf("%.2f\n", ql.tinhDiemTrungBinhLop());

        System.out.println("\nSinh viên >= 8:");
        ql.locSinhVienTheoDiem(8.0).forEach(System.out::println);

        ql.sapXepTheoDiem();
        System.out.println("\nSau khi sắp xếp:");
        ql.hienThiDanhSach();

        ql.xoaSinhVien("SV002");
        ql.hienThiDanhSach();

        ql.hienThiHaiSinhVienDauTien();


	}

}
