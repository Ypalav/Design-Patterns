package com.plateonfire;

public class StartState implements StateInterface {

	public void doStateAction(StateContext context) {
		System.out.println("Starting the Plate on Fire Game");
		context.setState(this);
	}

	public String getStateName() {
		return "Start State";
	}

}
