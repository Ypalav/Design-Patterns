package com.plateonfire;

public class SpiderMan extends Character {

	static SpiderMan spiderMan = null;

	private SpiderMan() {
		powerBarLevel = 100;
	}

	static synchronized Character getCharcter() {
		if (spiderMan == null) {
			spiderMan = new SpiderMan();
			return spiderMan;
		}
		return spiderMan;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public void punch(Character character) {
		System.out.println("Punching by spiderMan");
		powerBarLevel += 2;
		character.decreasePower();
	}

	@Override
	public void kick(Character character) {
		System.out.println("Kick by spiderMan");
		powerBarLevel += 3;
		character.decreasePower();
	}

	@Override
	public void reputationLevel() {
		System.out.println("Increasing the repulation Level of SpiderMan");
		reputationLevel += 1;
	}

	public void releaseWeb() {
		System.out.println("SpiderMan's Special Power- Web");
		powerBarLevel = +2;
	}

	@Override
	public void addPower(String arg) {
		System.out.println("special power of :" + arg);

	}

	@Override
	public void decreasePower() {
		System.out.println("Dereasing power Level of Spider");
		powerBarLevel -= 2;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Spider Man....");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Spider Man";
	}

	@Override
	public void winner(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Spider Man is a winner");
		powerBarLevel = 100;
		character.decreasePowerLooser(character);
		setLevel();
		setExperience(experienceLevel + 20);
	}

	@Override
	public void decreasePowerLooser(Character character) {
		System.out.println("Spider Man is a Looser");
		powerBarLevel = 0;

	}
}
