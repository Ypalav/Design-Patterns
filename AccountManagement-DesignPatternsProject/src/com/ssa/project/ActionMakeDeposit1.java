package com.ssa.project;
public class ActionMakeDeposit1 extends ActionMakeDeposit{
	//make deposit in the account simply summing up with current values 
	public void makeDeposit() {
		dataStore.setDepositAmount(dataStore.getTemp_d());
		dataStore.computeDeposit();
		System.out.println("Account 1: After Deposit, Balance is " + dataStore.getBalance() );}}
