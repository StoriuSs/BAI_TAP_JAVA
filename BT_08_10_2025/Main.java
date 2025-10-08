import model.*;
import order.Order;
import payment.*;

public class Main {
    public static void main(String[] args) {
        ElectronicProduct dienThoai = new ElectronicProduct("E01", "Dien thoai Samsung", 200000, "IMEI123", 12);
        FoodProduct banhMi = new FoodProduct("F01", "Banh mi", 15000, "10/2025");

        Order don1 = new Order("Nguyen Van A");
        don1.themSanPham(dienThoai);
        don1.checkout(new CashPayment());

        Order don2 = new Order("Nguyen Van B");
        don2.themSanPham(dienThoai);
        don2.themSanPham(banhMi);
        don2.checkout(new CreditCardPayment());

        Order don3 = new Order("Nguyen Van C");
        don3.themSanPham(banhMi);
        don3.checkout(new MomoPayment());

        Order don4 = new Order("Nguyen Van D");
        don4.themSanPham(dienThoai);
        don4.checkout(new ZaloPayPayment());
    }
}
