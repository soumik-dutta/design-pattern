package com.soumik.decorator;

public class IcecreamDecorator implements IceCream {
    private IceCream iceCream;

    public IcecreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public double cost() {
        return this.iceCream.cost();
    }
}
