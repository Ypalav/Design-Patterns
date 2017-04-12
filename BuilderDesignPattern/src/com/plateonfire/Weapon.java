package com.plateonfire;

public class Weapon extends AbstractPower {

	public Weapon(Character character) {
		super(character);
	}

	@Override
	public void getPower(String args) {
		character.addPower("Weapon Knife");
	}
}
