package model;

public abstract class Product {
    protected String ma;
    protected String ten;
    protected double gia;

    public Product(String ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    public String getTen() {
        return ten;
    }
}
