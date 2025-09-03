package BT_03_09_2025.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SinhVien sv1 = new SinhVien();
        sv1.nhapThongTin(sc);
        SinhVien sv2 = new SinhVien();
        sv2.nhapThongTin(sc);
        SinhVien sv3 = new SinhVien("SV003", "Tran Thi B", 19);

        System.out.println("\n--- Danh sach sinh vien ---");
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        sv3.hienThiThongTin();
        SinhVien.hienThiTongSV();
        
        sc.close(); // Close the Scanner when finished with all input
    }
}
