package BT_03_09_2025.Bai2;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private static int count = 0;

    public SinhVien() {
        count++;
    }

    public SinhVien(String maSV, String hoTen, int tuoi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        count++;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
    }
    
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma SV: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
    }

    public void hienThiThongTin() {
        System.out.println("Ma SV: " + maSV + " | Ho ten: " + hoTen + " | Tuoi: " + tuoi);
    }

    public static void hienThiTongSV() {
        System.out.println("Tong so sinh vien da tao: " + count);
    }
}
