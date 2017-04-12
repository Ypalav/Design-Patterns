package com.plateonfire;

public abstract class AbstractPower implements Power {

	protected Character character;

	public AbstractPower(Character character) {
		this.character = character;
	}

	public void getPower(String args) {
		character.addPower(args);
	}

}
