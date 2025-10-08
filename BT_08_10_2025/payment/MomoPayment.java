package payment;

public class MomoPayment implements PaymentMethod {
    public void pay(double amount, String tenKhach) {
        System.out.println("Khach hang: " + tenKhach + ". Tong tien: " + amount + ". Thanh toan bang vi Momo thanh cong.");
    }
}
