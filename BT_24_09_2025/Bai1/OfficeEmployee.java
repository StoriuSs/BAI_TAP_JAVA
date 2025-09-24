package BT_24_09_2025.Bai1;

public class OfficeEmployee extends Employee {
    private int soNgayLamViec; 

    public OfficeEmployee(String ten, int tuoi, double tienLuongCoBan, int soNgayLamViec) {
        super(ten, tuoi, tienLuongCoBan);
        this.soNgayLamViec = soNgayLamViec;
    }
    
    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }
    
    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }
    
    @Override
    public double tinhLuong() {
        return soNgayLamViec * tienLuongCoBan;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("THONG TIN NHAN VIEN VAN PHONG");
        super.hienThiThongTin();
        System.out.println("So ngay lam viec: " + soNgayLamViec);
    }
}