package model;

public class FoodProduct extends Product {
    private String hanSuDung;

    public FoodProduct(String ma, String ten, double gia, String hanSuDung) {
        super(ma, ten, gia);
        this.hanSuDung = hanSuDung;
    }
}
