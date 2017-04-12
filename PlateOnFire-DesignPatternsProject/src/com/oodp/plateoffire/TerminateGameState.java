package com.oodp.plateoffire;

public class TerminateGameState implements GameStateInterface {

	public void doStateAction(GameStateContext context) {
		// TODO Auto-generated method stub
		System.out.println("Terminating the Game");
		context.setState(this);
	}

	public String getStateName() {
		// TODO Auto-generated method stub
		return "Game Ends!!";
	}
}
