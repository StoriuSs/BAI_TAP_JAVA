package BT_24_09_2025.Bai1;

public class Main {
    public static void main(String[] args) {
        OfficeEmployee nhanVienVanPhong = new OfficeEmployee(
            "Nguyen Van An", 
            28, 
            100000, 
            22     
        );
        
        TechnicalEmployee nhanVienKyThuat = new TechnicalEmployee(
            "Tran Thi Binh",
            25,
            0,
            180,
            50000   
        );
        
        nhanVienVanPhong.hienThiThongTin();
        System.out.println();

        nhanVienKyThuat.hienThiThongTin();
        System.out.println();
        
        Employee[] danhSachNhanVien = {
            new OfficeEmployee("Le Van Cuong", 30, 120000, 20),
            new TechnicalEmployee("Pham Thi Dung", 27, 0, 160, 60000)
        };
        
        for (int i = 0; i < danhSachNhanVien.length; i++) {
            System.out.println("Nhan vien " + (i + 1) + ":");
            System.out.println("Ten: " + danhSachNhanVien[i].getTen());
            System.out.println("Luong: " + danhSachNhanVien[i].tinhLuong() + " VND");
        }
    }
}