package net.cijug.discgolf;

public class Disc {

    private Money price;
    private String name;


    public Disc(String name, String price) {
        this.name = name;
        this.price = new Money(price);
    }


    public String getPriceFormatted() {
        return getPrice().formatted();
    }


    public String getName() {
        return name;
    }


    public Money getPrice() {
        return price;
    }


}
