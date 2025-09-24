package BT_24_09_2025.Bai2;

public class TechnicalEmployee extends Employee implements Programmer, EmailSender {
    public TechnicalEmployee(String name, int age, double salary) {
        super(name, age, salary);
    }
    
    @Override
    public void program() {
        System.out.println(name + " dang lap trinh.");
    }
    
    @Override
    public void sendEmail() {
        System.out.println(name + " dang gui email.");
    }
}