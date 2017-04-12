package com.plateonfire;

public class Strategy {
	private StrategyInterface strategy;

	public Strategy(StrategyInterface strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy(Character player) {
		strategy.executeStrategy(player);
	}
}
