package BT_24_09_2025.Bai1;

public abstract class Employee {
    protected String ten;     
    protected int tuoi;          
    protected double tienLuongCoBan; 
    
    public Employee(String ten, int tuoi, double tienLuongCoBan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.tienLuongCoBan = tienLuongCoBan;
    }

    public String getTen() {
        return ten;
    }
    
    public int getTuoi() {
        return tuoi;
    }
    
    public double getTienLuongCoBan() {
        return tienLuongCoBan;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void setTienLuongCoBan(double tienLuongCoBan) {
        this.tienLuongCoBan = tienLuongCoBan;
    }
    
    public abstract double tinhLuong();
    
    public void hienThiThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Tien luong co ban: " + tienLuongCoBan);
        System.out.println("Luong thuc te: " + tinhLuong());
    }
}