package com.oodp.plateoffire;

import com.oodp.plateoffire.AbstractPower;

public class WeaponPower extends AbstractPower{

	public WeaponPower(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void getPower(String args) {
		character.addPower("Sniper Activated");
	}
}
