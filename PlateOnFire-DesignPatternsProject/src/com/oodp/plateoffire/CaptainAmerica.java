package com.oodp.plateoffire;

public class CaptainAmerica extends Character{
static CaptainAmerica captainAmerica;
	
	private CaptainAmerica(){
		powerBarLevel = 10;
	}
	
	static synchronized Character getCharacter(){
		if (captainAmerica == null) {
			captainAmerica = new CaptainAmerica();
			return captainAmerica;
		}
		return captainAmerica;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void winner(Character character) {
		System.out.println("CaptainAmerica is a winner");
		powerBarLevel = 100;
		character.decreasePowerOfLooser(character);
		setLevel();
		setExperience(experienceLevel + 20);
	}

	public void decreasePowerOfLooser(Character character) {
		System.out.println("CaptainAmerica is a Looser");
		powerBarLevel = 0;
	}

	public void draw() {
		System.out.println("Drawing CaptainAmerica....");
	}
	
	public String getName() {
		return "CaptainAmerica";
	}

	public void decreasePower() {
		System.out.println("Dereasing power Level of CaptainAmerica");
		powerBarLevel -= 5;
	}

	public void addPower(String arg) {
		System.out.println("CaptainAmerica Special Power : " + arg);
	}

	@Override
	public void nullifyPower(Character character) {
		System.out.println("Power Nullified of "+ character.getName());
		character.powerBarLevel += 5;
	}

	public void useVibraniumSteelShield(){
		System.out.println("SHIELD activated");
	}
	
	@Override
	public void attack(Character character) {
		System.out.println("Attacked by Captain America");
		powerBarLevel += 5;
		character.decreasePower();
	}
}
