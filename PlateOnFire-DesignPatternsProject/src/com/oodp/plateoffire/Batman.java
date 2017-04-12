package com.oodp.plateoffire;

public class Batman extends Character{
	
	static Batman batman;
	
	private Batman(){
		powerBarLevel = 10;
	}
	
	static synchronized Character getCharacter(){
		if (batman == null) {
			batman = new Batman();
			return batman;
		}
		return batman;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void winner(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Batman is a winner");
		powerBarLevel = 100;
		character.decreasePowerOfLooser(character);
		setLevel();
		setExperience(experienceLevel + 20);
	}

	public void decreasePowerOfLooser(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Batman is a Looser");
		powerBarLevel = 0;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Batman....");
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Batman";
	}

	public void decreasePower() {
		// TODO Auto-generated method stub
		System.out.println("Dereasing power Level of Batman");
		powerBarLevel -= 5;
	}

	public void addPower(String arg) {
		// TODO Auto-generated method stub
		System.out.println("Batman Special Power : " + arg);
	}

	@Override
	public void nullifyPower(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Power Nullified of "+ character.getName());
		character.powerBarLevel += 5;
	}

	public void useBatMobile() {
		System.out.println("Batmobile activated");
	}
	
	public void useBatPod(){
		System.out.println("Batpod activated");
	}

	@Override
	public void attack(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Attacked by Batman");
		powerBarLevel += 5;
		character.decreasePower();
	}

}
