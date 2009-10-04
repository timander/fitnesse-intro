package net.cijug.discgolf;

public class Money {
    private Double amount;


    public Money(String amount) {
        this.amount = new Double(amount.replaceAll("\\$", ""));
    }

    public Money(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public String formatted() {
        return "$" + amount.intValue();
    }

    public Money subtract(Money price) {
        return new Money(amount - price.getAmount());
    }
}
