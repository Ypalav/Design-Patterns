package com.ssa.project;

public class ActionMakeDeposit2 extends ActionMakeDeposit {
	public void makeDeposit() {
		dataStore.setDepositAmount_2(dataStore.getTemp_d_2());
		dataStore.computeDeposit_2();
		System.out.println("Account 2: After Deposit, Balance is "
				+ dataStore.getBalance_2());
	}
}
