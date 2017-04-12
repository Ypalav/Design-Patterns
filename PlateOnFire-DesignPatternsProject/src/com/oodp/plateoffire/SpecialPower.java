package com.oodp.plateoffire;

public class SpecialPower extends AbstractPower {

	public SpecialPower(Character character) {
		super(character);
	}
	
	@Override
	public void getPower(String args) {
		character.addPower("Special Power Activated");
	}

}
