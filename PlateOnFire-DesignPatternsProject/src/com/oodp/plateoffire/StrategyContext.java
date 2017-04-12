package com.oodp.plateoffire;


public class StrategyContext {
	private StrategyInterface strategy;

	public StrategyContext(StrategyInterface strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy(Character character) {
		strategy.executeStrategy(character);
	}
}
