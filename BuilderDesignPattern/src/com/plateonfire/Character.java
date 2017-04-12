package com.plateonfire;

public abstract class Character {
	public int experienceLevel;
	public int powerBarLevel = 100;
	public int reputationLevel;
	public int level=1;

	public abstract void punch(Character character);

	public abstract void winner(Character character);

	public abstract void decreasePowerLooser(Character character);

	public abstract void draw();

	public abstract void kick(Character character);

	public abstract String getName();

	public abstract void decreasePower();

	public abstract void addPower(String arg);

	public abstract void reputationLevel();

	public void increasePowerOnWin() {
		powerBarLevel = 100;
		System.out.println("Power Bar Increased to 100");
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
