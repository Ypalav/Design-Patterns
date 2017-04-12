package com.plateonfire;

import java.util.ArrayList;
import java.util.Random;

public class PlateofFire {

	private static final String[] characters = { "spiderman", "superman", "flash" };
	static ArrayList<Character> characterList = new ArrayList<Character>();
	Character character;
	static Random random = new Random();

	public static void main(String args[]) {
		// state behavioral pattern
		StateContext context = new StateContext();
		StateInterface startState = new StartState();
		startState.doStateAction(context);
		System.out.println(context.getState().getStateName());

		// Fly Weight
		for (int i = 0; i < characters.length; i++) {
			characterList.add(CharacterFactory.getCharacter(characters[i]));
		}

		// get the Character Randomly
		Character player1 = characterList.get(random.nextInt(3));
		Character player2 = characterList.get(random.nextInt(3));
		drawCharacter(player1);
		drawCharacter(player2);

		if (player1.level == player2.level) {
			player1.punch(player2);
			player2.kick(player1);
			VehiclePower vehiclePower = new VehiclePower(player1);
			vehiclePower.getPower("Vehicle");
			InvisiblityPower invisiblityPower = new InvisiblityPower(player2);
			invisiblityPower.getPower("Invisibility");
			Strategy liftDropStrategy = new Strategy(new LiftDropStrategy());
			liftDropStrategy.executeStrategy(player1);
			player1.winner(player2);
		} else {
			System.out.println("Game not possible");
		}

		// state behavioral pattern
		StateInterface stopState = new StopState();
		stopState.doStateAction(context);
		System.out.println(context.getState().getStateName());

	}

	public static void drawCharacter(Character character) {
		character.draw();
	}
}
