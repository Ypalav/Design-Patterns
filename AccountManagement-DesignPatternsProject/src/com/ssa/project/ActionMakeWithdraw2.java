package com.ssa.project;
public class ActionMakeWithdraw2 extends ActionMakeWithdraw{
	public void makeWithdraw() {
		dataStore.setWithdrawAmount_2(dataStore.getTemp_w_2());
		dataStore.computeWithdraw_2();
		System.out.println("Account 2: After Withdraw, Balance is " + dataStore.getBalance_2());}}
