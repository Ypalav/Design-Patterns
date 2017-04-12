package com.ssa.project;
public class ActionStoreData1 extends ActionStoreData{
	public void storeData() {
		dataStore.setPin(dataStore.getTemp_p());
		dataStore.setUid(dataStore.getTemp_y());
		dataStore.setBalance(dataStore.getTemp_a()); 
	}
}
