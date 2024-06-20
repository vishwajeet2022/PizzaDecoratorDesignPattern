package org.example;

public abstract class ToppingDecorator implements BasePizza{
    BasePizza basePizza;

    ToppingDecorator(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    public int getCost(){
        return basePizza.getPrice();
    }
}
