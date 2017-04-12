package com.plateonfire;

public class InvisiblityPower extends AbstractPower {

	public InvisiblityPower(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPower(String args) {
		character.addPower("Invisibility");
	}

}
