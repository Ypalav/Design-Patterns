package com.plateonfire;

public class BangHeadStrategy implements StrategyInterface {

	public void executeStrategy(Character character) {
		System.out.println(character.getName()+" Executing Strategy: Bangging the Head on other Character.");

	}

}
