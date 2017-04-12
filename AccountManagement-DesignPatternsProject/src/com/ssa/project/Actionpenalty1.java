package com.ssa.project;

public class Actionpenalty1 extends Actionpenalty{

	public void penalty() {
		dataStore.setPenalty();
		System.out.println("Account1:: Minimum required balance is $1000. So Penalty is applied.");
		System.out.println("Account1:: After a Penalty of 10$, Balance is " + dataStore.getBalance() );
	}

}
