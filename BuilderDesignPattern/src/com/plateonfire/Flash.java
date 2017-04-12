package com.plateonfire;

public class Flash extends Character implements StrategyInterface {

	static Flash flash = null;

	private Flash() {
		powerBarLevel = 100;
	}

	static synchronized Character getCharcter() {
		if (flash == null) {
			flash = new Flash();
			return flash;
		}
		return flash;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public void punch(Character character) {
		System.out.println("Punch by Flash");
		powerBarLevel += 2;
		character.decreasePower();
	}

	@Override
	public void kick(Character character) {
		System.out.println("Kick by Flash");
		powerBarLevel += 3;
		character.decreasePower();
	}

	@Override
	public void reputationLevel() {
		System.out.println("Increasing the repulation Level of SuperMan");
		reputationLevel += 1;

	}

	public void runFast(Character character) {
		System.out.println("Flash special Power - Run Fast and Punch");
		powerBarLevel += 6;
		character.decreasePower();
	}

	public void timeTravel() {
		System.out.println("Flash special Power - Time Travel");
	}

	@Override
	public void addPower(String arg) {
		System.out.println("Flash Special Power of: " + arg);

	}

	public void decreasePower() {
		System.out.println("Dereasing power Level of Flash");
		powerBarLevel -= 2;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Flash....");

	}

	public void executeStrategy(Character player) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Flash";
	}

	@Override
	public void winner(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Flash is a winner");
		powerBarLevel = 100;
		character.decreasePowerLooser(character);
		setLevel();
		setExperience(experienceLevel + 20);
	}

	@Override
	public void decreasePowerLooser(Character character) {
		System.out.println("Flash is a Looser");
		powerBarLevel = 0;

	}
}
