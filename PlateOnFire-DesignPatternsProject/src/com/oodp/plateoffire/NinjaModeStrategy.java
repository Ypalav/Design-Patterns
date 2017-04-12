package com.oodp.plateoffire;

public class NinjaModeStrategy implements StrategyInterface{

	public void executeStrategy(Character character) {
		System.out.println(character.getName()
				+ " is Executing Strategy: Activated NinjaMode, you can't see me now!!!");
	}
		
}
	
