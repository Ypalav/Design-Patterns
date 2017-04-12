package com.plateonfire;

public class StopState implements StateInterface {

	public void doStateAction(StateContext context) {
		System.out.println("Sopping the Game.....");
		context.setState(this);
	}
	
	public String getStateName(){
		return "Stop State";
	}

}
