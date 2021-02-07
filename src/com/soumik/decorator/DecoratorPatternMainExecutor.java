package com.soumik.decorator;

import com.soumik.MainExecutor;

public class DecoratorPatternMainExecutor implements MainExecutor {
    @Override
    public void execute() {
        IceCream iceCream = new BasicIcecream();
        System.out.println("Adding Basic Icecream " + iceCream.cost());

        IceCream vanilla = new VanillaIcecream(iceCream);
        System.out.println("Adding vanilla flavour  " + vanilla.cost());

        IceCream chocolate = new ChocolateIcecream( vanilla);
        System.out.println("Adding chocolate flavour " + chocolate.cost() );
    }
}
