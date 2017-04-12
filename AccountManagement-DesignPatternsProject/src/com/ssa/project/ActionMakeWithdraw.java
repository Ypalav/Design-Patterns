package com.ssa.project;
public abstract class ActionMakeWithdraw {
	DataStore dataStore;
	public abstract void makeWithdraw();
	public void setData(DataStore dataStore) {
		this.dataStore = dataStore;}}
