package com.soumik.decorator;

public class VanillaIcecream extends IcecreamDecorator {
    private IceCream iceCream;
    public VanillaIcecream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return 0.75 + super.cost();
    }
}
