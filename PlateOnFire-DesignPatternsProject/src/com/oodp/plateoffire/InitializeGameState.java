package com.oodp.plateoffire;

public class InitializeGameState implements GameStateInterface {

	public void doStateAction(GameStateContext context) {
		// TODO Auto-generated method stub
		System.out.println("Initializing the Game");
		context.setState(this);
	}

	public String getStateName() {
		// TODO Auto-generated method stub
		return "Ready To Play";
	}

}
