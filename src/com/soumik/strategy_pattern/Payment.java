package com.soumik.strategy_pattern;

/**
 * Payment is a specific job that needs to be performed
 * but it can be done  through different mode like
 * CreditCard, Paypal, Netbanking, UPI
 */
public interface Payment {
    // common denominator abstract method
    void pay(int amount);
}
