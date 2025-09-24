package BT_24_09_2025.Bai2;

public class Main {
    public static void main(String[] args) {
        OfficeEmployee office = new OfficeEmployee("Nguyen Van A", 30, 5000);
        TechnicalEmployee tech = new TechnicalEmployee("Tran Van B", 25, 7000);
        SalesEmployee sales = new SalesEmployee("Le Thi C", 28, 6000);
        
        System.out.println("Nhan vien van phong:");
        office.displayInfo();
        office.sendEmail();
        
        System.out.println("\nNhan vien ky thuat:");
        tech.displayInfo();
        tech.program();
        tech.sendEmail();
        
        System.out.println("\nNhan vien ban hang:");
        sales.displayInfo();
        sales.sell();
        sales.sendEmail();
        
        System.out.println("\nDemo tinh da hinh:");
        Employee[] employees = {office, tech, sales};
        
        for (Employee emp : employees) {
            emp.displayInfo();
            if (emp instanceof EmailSender) {
                ((EmailSender) emp).sendEmail();
            }
            if (emp instanceof Programmer) {
                ((Programmer) emp).program();
            }
            if (emp instanceof Salesperson) {
                ((Salesperson) emp).sell();
            }
            System.out.println();
        }
    }
}