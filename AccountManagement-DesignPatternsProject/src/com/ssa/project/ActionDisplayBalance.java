package com.ssa.project;
public abstract class ActionDisplayBalance {
	DataStore dataStore;
	public abstract void displayBalance();
	//set data store object
	public void setData(DataStore dataStore) {
		this.dataStore = dataStore;	
	}
}
