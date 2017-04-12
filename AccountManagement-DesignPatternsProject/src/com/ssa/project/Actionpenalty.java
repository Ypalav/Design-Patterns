package com.ssa.project;

public abstract class Actionpenalty {
	DataStore dataStore;
	public abstract void penalty();
	public void setData(DataStore dataStore) {
		this.dataStore = dataStore;
	}
}
