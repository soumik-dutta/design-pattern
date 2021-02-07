package com.soumik.decorator;

public class ChocolateIcecream extends IcecreamDecorator{
    public ChocolateIcecream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return 1.0 + super.cost();
    }

}
