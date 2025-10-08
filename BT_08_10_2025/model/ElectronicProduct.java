package model;

public class ElectronicProduct extends Product {
    private String imei;
    private int baoHanh;

    public ElectronicProduct(String ma, String ten, double gia, String imei, int baoHanh) {
        super(ma, ten, gia);
        this.imei = imei;
        this.baoHanh = baoHanh;
    }
}
