package BT_24_09_2025.Bai1;

public class TechnicalEmployee extends Employee {
    private int soGioLamViec;      
    private double tienCongTheoGio; 

    public TechnicalEmployee(String ten, int tuoi, double tienLuongCoBan, int soGioLamViec, double tienCongTheoGio) {
        super(ten, tuoi, tienLuongCoBan);
        this.soGioLamViec = soGioLamViec;
        this.tienCongTheoGio = tienCongTheoGio;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }
    
    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public double getTienCongTheoGio() {
        return tienCongTheoGio;
    }
    
    public void setTienCongTheoGio(double tienCongTheoGio) {
        this.tienCongTheoGio = tienCongTheoGio;
    }
    
    @Override
    public double tinhLuong() {
        return soGioLamViec * tienCongTheoGio;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("THONG TIN NHAN VIEN KY THUAT");
        super.hienThiThongTin();
        System.out.println("So gio lam viec: " + soGioLamViec);
        System.out.println("Tien cong theo gio: " + tienCongTheoGio);
    }
}