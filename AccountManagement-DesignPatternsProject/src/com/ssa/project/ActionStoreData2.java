package com.ssa.project;
public class ActionStoreData2 extends ActionStoreData{
	public void storeData() {
		dataStore.setPin_2(dataStore.getTemp_p_2());
		dataStore.setUid_2(dataStore.getTemp_y_2());
		dataStore.setBalance_2(dataStore.getTemp_a_2()); 
	}
}
