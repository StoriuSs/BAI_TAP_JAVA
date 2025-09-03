package BT_03_09_2025.Bai1;

public class HinhChuNhat {
    private double length;
    private double width;

    public HinhChuNhat(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
