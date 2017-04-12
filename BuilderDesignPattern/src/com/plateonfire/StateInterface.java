package com.plateonfire;

public interface StateInterface {
	public void doStateAction(StateContext context);
	public String getStateName();
}
