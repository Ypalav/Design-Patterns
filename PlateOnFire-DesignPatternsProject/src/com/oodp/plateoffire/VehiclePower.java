package com.oodp.plateoffire;

public class VehiclePower extends AbstractPower{
	public VehiclePower(Character character) {
		super(character);
	}

	@Override
	public void getPower(String args) {
		character.addPower("vehicle");
	}

}
