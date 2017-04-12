package com.plateonfire;

public class StateContext {
	private StateInterface state;

	public StateInterface getState() {
		return state;
	}

	public void setState(StateInterface state) {
		this.state = state;
	}
}
