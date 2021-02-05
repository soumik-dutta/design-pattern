package com.soumik;

import com.soumik.observer.ObserverPatternMainExecutor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MainExecutor mainExecutor;
        // Strategy Pattern
//        mainExecutor = new StrategyPatternMainExecutor();
        // Observer Pattern
        mainExecutor = new ObserverPatternMainExecutor();
        mainExecutor.execute();
    }
}
