package com.plateonfire;

public class SuperMan extends Character {

	static SuperMan superMan = null;

	private SuperMan() {
		powerBarLevel = 100;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	static synchronized Character getCharcter() {
		if (superMan == null) {
			superMan = new SuperMan();
			return superMan;
		}
		return superMan;
	}

	@Override
	public void punch(Character character) {
		System.out.println("Punching by SuperMan");
		character.decreasePower();
		powerBarLevel += 2;
	}

	@Override
	public void kick(Character character) {
		System.out.println("Kick by SuperMan");
		character.decreasePower();
		powerBarLevel += 3;
	}

	@Override
	public void reputationLevel() {
		System.out.println("Increasing the repulation Level of SuperMan");
		reputationLevel += 1;

	}

	public void fly() {
		System.out.println("SuperMan's Special Power- Fly");
	}

	public void releaseLesar(Character character) {
		System.out.println("SuperMan's special power- Laser");
		powerBarLevel += 6;
		character.decreasePower();
	}

	@Override
	public void addPower(String arg) {
		System.out.println("SuperMan Special Power of: " + arg);

	}

	@Override
	public void decreasePower() {
		System.out.println("Dereasing power Level of SuperMan");
		powerBarLevel -= 2;

	}

	@Override
	public void draw() {
		System.out.println("Drawing Super Man....");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Super Man";
	}

	@Override
	public void winner(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Super Man is a winner");
		powerBarLevel = 100;
		character.decreasePowerLooser(character);
		setLevel();
		setExperience(experienceLevel + 20);
	}

	@Override
	public void decreasePowerLooser(Character character) {
		System.out.println("Super Man is a Looser");
		powerBarLevel = 0;

	}
}
