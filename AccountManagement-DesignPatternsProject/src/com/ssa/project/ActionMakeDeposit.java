package com.ssa.project;
public abstract class ActionMakeDeposit{
	DataStore dataStore;
	public abstract void makeDeposit();
	public void setData(DataStore dataStore) {this.dataStore = dataStore;}}	
