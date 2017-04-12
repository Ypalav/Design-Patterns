package com.oodp.plateoffire;

public class GameStateContext {
	private GameStateInterface state;

	public GameStateInterface getState() {
		return state;
	}

	public void setState(GameStateInterface state) {
		this.state = state;
	}
}
