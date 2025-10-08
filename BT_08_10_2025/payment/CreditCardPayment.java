package payment;

public class CreditCardPayment implements PaymentMethod {
    public void pay(double amount, String tenKhach) {
        System.out.println("Khach hang: " + tenKhach + ". Tong tien: " + amount + ". Thanh toan bang the tin dung thanh cong.");
    }
}
