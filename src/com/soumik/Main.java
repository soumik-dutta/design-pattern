package com.soumik;

import com.soumik.decorator.DecoratorPatternMainExecutor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MainExecutor mainExecutor;
        // Strategy Pattern
//        mainExecutor = new StrategyPatternMainExecutor();
        // Observer Pattern
//        mainExecutor = new ObserverPatternMainExecutor();
        // decorator
        mainExecutor = new DecoratorPatternMainExecutor();
        mainExecutor.execute();
    }
}
