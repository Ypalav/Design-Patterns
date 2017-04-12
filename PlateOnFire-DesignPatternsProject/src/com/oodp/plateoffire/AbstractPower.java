package com.oodp.plateoffire;

import com.oodp.plateoffire.Character;

public abstract class AbstractPower implements Power{
	protected Character character;

	public AbstractPower(Character character) {
		this.character = character;
	}
	public void getPower(String args) {
		// TODO Auto-generated method stub
		character.addPower(args);
	}
}
