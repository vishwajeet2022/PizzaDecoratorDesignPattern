package org.example;

public class ExtraCheeseTopping extends ToppingDecorator{
    ExtraCheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getPrice() {
        return this.getCost()+10;
    }

    @Override
    public void display() {
        System.out.println("Total cost with ExtraCheese "+this.getPrice());
    }
}
