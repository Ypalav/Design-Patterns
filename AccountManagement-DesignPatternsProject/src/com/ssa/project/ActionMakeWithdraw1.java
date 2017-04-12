package com.ssa.project;
public class ActionMakeWithdraw1 extends ActionMakeWithdraw{
	//make withdraw in the account simply deducting with current values 
	public void makeWithdraw() {
		dataStore.setWithdrawAmount(dataStore.getTemp_w());
		dataStore.computeWithdraw();
		System.out.println("Account 1: After Withdraw, Balance is " + dataStore.getBalance() );
	}}
