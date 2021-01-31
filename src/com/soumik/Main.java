package com.soumik;

import com.soumik.strategy_pattern.StrategyPatternMainExecutor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MainExecutor mainExecutor = new StrategyPatternMainExecutor();
        mainExecutor.execute();
    }
}
