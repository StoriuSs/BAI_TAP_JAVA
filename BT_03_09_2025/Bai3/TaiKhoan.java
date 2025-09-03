package BT_03_09_2025.Bai3;

class TaiKhoan {
    private String soTK;
    private String tenChuTK;
    private double soDu;

    private static double laiSuatNam = 0.05; 

    public TaiKhoan(String soTK, String tenChuTK, double soDu) {
        this.soTK = soTK;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Da nap " + soTien + " vao tai khoan " + soTK);
        } else {
            System.out.println("So tien nap phai lon hon 0");
        }
    }
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Da rut " + soTien + " tu tai khoan " + soTK);
        } else {
            System.out.println("So tien rut khong hop le hoac vuot qua so du");
        }
    }

    public void tinhLaiThang() {
        double lai = soDu * (laiSuatNam / 12);
        soDu += lai;
        System.out.println("Tai khoan " + soTK + " da cong lai: " + lai);
    }

    public void hienThi() {
        System.out.println("So TK: " + soTK + " | Chu TK: " + tenChuTK + " | So du: " + soDu);
    }

    public static void thayDoiLaiSuat(double laiSuatMoi) {
        if (laiSuatMoi >= 0) {
            laiSuatNam = laiSuatMoi;
            System.out.println("Da thay doi lai suat nam thanh: " + (laiSuatNam * 100) + "%");
        }
    }

    public static void hienThiLaiSuat() {
        System.out.println("Lai suat nam hien tai: " + (laiSuatNam * 100) + "%");
    }

    public String getSoTK() {
        return soTK;
    }

    public double getSoDu() {
        return soDu;
    }
}
