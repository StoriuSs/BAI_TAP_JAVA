package BT_03_09_2025.Bai3;

public class Main {
    public static void main(String[] args) {
        TaiKhoan[] dsTK = new TaiKhoan[3];
        dsTK[0] = new TaiKhoan("111", "Nguyen Van A", 5000);
        dsTK[1] = new TaiKhoan("222", "Tran Thi B", 2000);
        dsTK[2] = new TaiKhoan("333", "Le Van C", 10000);

        dsTK[0].napTien(2000);
        dsTK[1].rutTien(1000);
        dsTK[2].tinhLaiThang();

        System.out.println("\n--- Danh sach tai khoan sau giao dich ---");
        for (int i = 0; i < dsTK.length; i++) {
            dsTK[i].hienThi();
        }

        TaiKhoan.thayDoiLaiSuat(0.07); 
        TaiKhoan.hienThiLaiSuat();

        for (int i = 0; i < dsTK.length - 1; i++) {
            for (int j = i + 1; j < dsTK.length; j++) {
                if (dsTK[i].getSoDu() < dsTK[j].getSoDu()) {
                    TaiKhoan temp = dsTK[i];
                    dsTK[i] = dsTK[j];
                    dsTK[j] = temp;
                }
            }
        }

        System.out.println("\n--- Danh sach tai khoan (sap xep giam dan theo so du) ---");
        for (int i = 0; i < dsTK.length; i++) {
            dsTK[i].hienThi();
        }
    }
}
