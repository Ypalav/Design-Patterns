package com.oodp.plateoffire;

public abstract class Character {
	public int experienceLevel;
	public int powerBarLevel = 10;
	public int level = 1;
	
	public abstract void attack(Character character);

	public abstract void nullifyPower(Character character);

	public abstract void winner(Character character);

	public abstract void decreasePowerOfLooser(Character character);

	public abstract void draw();

	public abstract String getName();

	public abstract void decreasePower();

	public abstract void addPower(String arg);

	public void increasePowerBarOnWin() {
		powerBarLevel += 100;
		System.out.println("Power Bar Increased to " + powerBarLevel); 	
	}

	public int getPowerLevel() {
		return powerBarLevel;
	}

	public void setLevel() {
		level += 1;
	}

	public void setExperience(int experience) {
		experienceLevel = experience;
	}

}
