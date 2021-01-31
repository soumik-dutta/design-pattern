package com.soumik.strategy_pattern;

import com.soumik.MainExecutor;

public class StrategyPatternMainExecutor implements MainExecutor {
    @Override
    public void execute() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Payment creditCard = new CreditCardAlgorithm("soumik", "dummy card number");
        Payment payPalPayment = new PaypalAlgorithm("soumik", "********");

        Product shirt = new Product(12, "shirt");
        Product pant =  new Product(30, "pant");

        shoppingCart.addProduct(shirt);
        shoppingCart.addProduct(pant);
        shoppingCart.addProduct(pant);

        shoppingCart.pay(creditCard);
        shoppingCart.pay(payPalPayment);
    }
}
