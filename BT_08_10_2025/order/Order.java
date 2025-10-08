package order;

import java.util.*;
import model.Product;
import payment.PaymentMethod;

public class Order {
    private String tenKhach;
    private List<Product> danhSachSanPham = new ArrayList<>();

    public Order(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public void themSanPham(Product p) {
        danhSachSanPham.add(p);
    }

    public double tinhTongTien() {
        double tong = 0;
        for (Product p : danhSachSanPham) tong += p.getGia();
        return tong;
    }

    public void checkout(PaymentMethod phuongThuc) {
        double tong = tinhTongTien();
        phuongThuc.pay(tong, tenKhach);
    }
}
