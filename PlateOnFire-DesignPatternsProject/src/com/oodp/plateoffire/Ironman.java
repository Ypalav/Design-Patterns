package com.oodp.plateoffire;

public class Ironman extends Character{
static Ironman ironman;
	
	private Ironman(){
		powerBarLevel = 10;
	}
	
	static synchronized Character getCharacter(){
		if (ironman == null) {
			ironman = new Ironman();
			return ironman;
		}
		return ironman;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void winner(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Ironman is a winner");
		powerBarLevel = 100;
		character.decreasePowerOfLooser(character);
		setLevel();
		setExperience(experienceLevel + 20);
	}

	public void decreasePowerOfLooser(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Ironman is a Looser");
		powerBarLevel = 0;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Ironman....");
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Ironman";
	}

	public void decreasePower() {
		// TODO Auto-generated method stub
		System.out.println("Dereasing power Level of Ironman");
		powerBarLevel -= 5;
	}

	public void addPower(String arg) {
		// TODO Auto-generated method stub
		System.out.println("Ironman Special Power : " + arg);
	}

	@Override
	public void nullifyPower(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Power Nullified of "+ character.getName());
		character.powerBarLevel += 5;
	}
	
	public void useEnergyRepulsors(){
		System.out.println("JARVIS, initiate the repulsors");
	}
	
	//JARVIS - AI used by Ironman
	public void useRegenerativeLifeSupport(){
		System.out.println("JARVIS, its time to regenerate");
	}
	
	//VERONICA - AI more stronger than Jarvis; mostly used as a last resort ;)
	public void activateVeronica(){
		System.out.println("Ohh Veronica, Jarvis is on vacation and I need you!!");
		System.out.println("Anytime for you stark!!");
	}
	
	@Override
	public void attack(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Attacked by Ironman");
		powerBarLevel += 5;
		character.decreasePower();
	}
	
}
