package org.example;

public class LoadedChickenTopping extends ToppingDecorator{
    LoadedChickenTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getPrice() {
        return basePizza.getPrice()+50;
    }

    @Override
    public void display() {
        System.out.println("Total cost with LoadedChicken "+this.getPrice());
    }
}
