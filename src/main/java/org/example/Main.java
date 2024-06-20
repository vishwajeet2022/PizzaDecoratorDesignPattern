package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePizza margretta=new MargrettaPizza(100);
        margretta.display();

        ToppingDecorator extaCheese=new ExtraCheeseTopping(margretta);
        extaCheese.display();

        ToppingDecorator loadedChicken=new LoadedChickenTopping(margretta);
        loadedChicken.display();
    }
}