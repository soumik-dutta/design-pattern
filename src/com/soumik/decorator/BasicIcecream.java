package com.soumik.decorator;

public class BasicIcecream implements IceCream {
    public BasicIcecream() {
        System.out.println("Creating Basic Icecream");
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
