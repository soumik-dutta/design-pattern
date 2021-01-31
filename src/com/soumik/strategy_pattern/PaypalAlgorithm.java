package com.soumik.strategy_pattern;

public class PaypalAlgorithm implements Payment {

    private String username;
    private String password;

    public PaypalAlgorithm(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid through paypal");
    }
}
