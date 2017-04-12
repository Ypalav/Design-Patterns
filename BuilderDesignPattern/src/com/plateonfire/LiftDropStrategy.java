package com.plateonfire;

public class LiftDropStrategy implements StrategyInterface {

	public void executeStrategy(Character character) {
		System.out.println(character.getName()+" Executing Strategy: Lifting a character and Droping it");
		
	}

}
