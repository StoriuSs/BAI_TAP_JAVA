package payment;

public class CashPayment implements PaymentMethod {
    public void pay(double amount, String tenKhach) {
        System.out.println("Khach hang: " + tenKhach + ". Tong tien: " + amount + ". Thanh toan tien mat thanh cong.");
    }
}
