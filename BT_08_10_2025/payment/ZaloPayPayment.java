package payment;

public class ZaloPayPayment implements PaymentMethod {
    public void pay(double amount, String tenKhach) {
        System.out.println("Khach hang: " + tenKhach + ". Tong tien: " + amount + ". Thanh toan bang ZaloPay thanh cong.");
    }
}
