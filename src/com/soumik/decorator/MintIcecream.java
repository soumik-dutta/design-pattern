package com.soumik.decorator;

public class MintIcecream extends IcecreamDecorator {
    public MintIcecream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return 1.25 + super.cost();
    }
}
