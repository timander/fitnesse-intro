package net.cijug.discgolf;

public class Disc {

    private Double price;
    private String name;

    public Disc(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public Double getPrice() {
        return price;
    }


}
