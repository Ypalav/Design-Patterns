package com.oodp.plateoffire;

import java.util.ArrayList;
import java.util.Random;

public class PlateOfFire {
	private static final String[] characters = { "batman", "captainAmerica", "ironman" };
	static ArrayList<Character> characterList = new ArrayList<Character>();
	Character character;
	static Random random = new Random();

	public static void main(String args[]) {

		GameStateContext gameStateContext = new GameStateContext();
		GameStateInterface initializeGame = new InitializeGameState();
		initializeGame.doStateAction(gameStateContext);
		System.out.println(gameStateContext.getState().getStateName());

		for (int i = 0; i < characters.length; i++) {
			characterList.add(CharacterFactory.getCharacter(characters[i]));
		}
		Character character1 = characterList.get(random.nextInt(3));
		Character character2 = characterList.get(random.nextInt(3));
		drawCharacter(character1);
		drawCharacter(character2);

		if (character1.level == character2.level) {
			character1.attack(character2);
			character2.attack(character1);
			character2.nullifyPower(character1);
			WeaponPower weaponPower = new WeaponPower(character2);
			weaponPower.getPower("Weapon");		
			StrategyContext ninjaModeStrategy = new StrategyContext(new NinjaModeStrategy());
			ninjaModeStrategy.executeStrategy(character1);
			character1.winner(character2);
		} else {
			System.out.println("Game not possible, level mismatch!!");
		}

		// state behavioral pattern
		GameStateInterface terminateState = new TerminateGameState();
		terminateState.doStateAction(gameStateContext);
		System.out.println(gameStateContext.getState().getStateName());

	}

	public static void drawCharacter(Character character) {
		character.draw();
	}
}
