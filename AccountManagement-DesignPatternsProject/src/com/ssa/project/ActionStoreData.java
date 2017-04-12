package com.ssa.project;
public abstract class ActionStoreData {
	DataStore dataStore;
	public abstract void storeData();
	public void setData(DataStore dataStore) {
		this.dataStore = dataStore;
	}
}
