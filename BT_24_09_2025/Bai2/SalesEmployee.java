package BT_24_09_2025.Bai2;

public class SalesEmployee extends Employee implements Salesperson, EmailSender {
    public SalesEmployee(String name, int age, double salary) {
        super(name, age, salary);
    }
    
    @Override
    public void sell() {
        System.out.println(name + " dang ban hang.");
    }
    
    @Override
    public void sendEmail() {
        System.out.println(name + " dang gui email.");
    }
}