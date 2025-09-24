package BT_24_09_2025.Bai2;

public class OfficeEmployee extends Employee implements EmailSender {
    public OfficeEmployee(String name, int age, double salary) {
        super(name, age, salary);
    }
    
    @Override
    public void sendEmail() {
        System.out.println(name + " dang gui email.");
    }
}