package BT_24_09_2025.Bai2;

public abstract class Employee {
    protected String name;
    protected int age;
    protected double salary;
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void displayInfo() {
        System.out.println("Ten: " + name + ", Tuoi: " + age + ", Luong: " + salary);
    }
}