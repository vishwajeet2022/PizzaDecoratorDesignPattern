package org.example;

public class MargrettaPizza implements BasePizza{
    private final int price;

    MargrettaPizza(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void display() {
        System.out.println("Total cost for BasePizza "+this.price);
    }
}
