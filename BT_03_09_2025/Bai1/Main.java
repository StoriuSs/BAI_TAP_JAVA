package BT_03_09_2025.Bai1;



public class Main {
    public static void main(String[] args) {
        HinhChuNhat hinh1 = new HinhChuNhat(5, 10);
        System.out.println("Chieu dai hinh 1: " + hinh1.getLength());
        System.out.println("Chieu rong hinh 1: " + hinh1.getWidth());
        System.out.println("Dien tich hinh 1: " + hinh1.getArea());
        System.out.println("Chu vi hinh 1: " + hinh1.getPerimeter());

        HinhChuNhat hinh2 = new HinhChuNhat(7.5, 12.3);
        System.out.println("Chieu dai hinh 2: " + hinh2.getLength());
        System.out.println("Chieu rong hinh 2: " + hinh2.getWidth());
        System.out.println("Dien tich hinh 2: " + hinh2.getArea());
        System.out.println("Chu vi hinh 2: " + hinh2.getPerimeter());

        HinhChuNhat hinh3 = new HinhChuNhat(6, 9);
        System.out.println("Chieu dai hinh 3: " + hinh3.getLength());
        System.out.println("Chieu rong hinh 3: " + hinh3.getWidth());
        System.out.println("Dien tich hinh 3: " + hinh3.getArea());
        System.out.println("Chu vi hinh 3: " + hinh3.getPerimeter());
    }
}
