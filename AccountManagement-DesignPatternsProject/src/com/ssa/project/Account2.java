package com.ssa.project;
public class Account2 {
	MDAEFSMContext mdaefsmContext;
	DataStore dataStore;
	AbstractFactory abstractFactory;
	// set reference to mda-efsm object
	public void setMdaEfsm(MDAEFSMContext mdaefsmContext) {
		this.mdaefsmContext = mdaefsmContext;
	}
	// Set reference to CF object
	public void setFactory(ConcreteFactory2 concreteFactory2) {
		this.abstractFactory = concreteFactory2;
	}
	// Set reference to Data object
	public void setData(DataStore dataStore) {
		this.dataStore = dataStore;
	}
	// accept inputs and store them in datastore
	public void OPEN(int p, int y, int a) {
		dataStore.setTemp_p_2(p);
		dataStore.setTemp_y_2(y);
		dataStore.setTemp_a_2(a);
		this.mdaefsmContext.open();
	}
	// accept pin number with below given conditions in code also check for incorrect pin with max attempts scenario
	public void PIN(int x) {
		if (x == (dataStore.getPin_2()))
			this.mdaefsmContext.CorrectPinAboveMin();
		else
			this.mdaefsmContext.IncorrectPin(2);
	}
	// deposit money
	public void DEPOSIT(int a) {
		dataStore.setTemp_d_2(a);
		this.mdaefsmContext.Deposit();
	}
	// withdraw money
	public void WITHDRAW(int w) {
		dataStore.setTemp_w_2(w);
		if (dataStore.getBalance_2() > 0)
			this.mdaefsmContext.Withdraw();
		else
			this.mdaefsmContext.NoFunds();
	}
	// check balance
	public void BALANCE() {
		this.mdaefsmContext.Balance();
	}
	// login to the account with login id
	public void LOGIN(int y) {
		if (y == dataStore.getUid_2()) {
			this.mdaefsmContext.Login();
		} else
			this.mdaefsmContext.IncorrectLogin();
	}
	// logout from the system and empty all the values
	public void LOGOUT() {
		this.mdaefsmContext.Logout();
		dataStore.setTemp_a_2(0);
		dataStore.setBalance_2(0);
		dataStore.setDepositAmount_2(0);
		dataStore.setPin_2(0);
		dataStore.setTemp_a_2(0);
		dataStore.setTemp_d_2(0);
		dataStore.setTemp_p_2(0);
		dataStore.setTemp_w_2(0);
		dataStore.setTemp_y_2(0);
		dataStore.setUid_2(0);
		dataStore.setWithdrawAmount_2(0);
	}
	//suspend the account
	public void suspend() {
		this.mdaefsmContext.Suspend();
	}
	//activate the account
	public void activate() {
		this.mdaefsmContext.Activate();
	}
	//close the account
	public void close() {
		this.mdaefsmContext.Close();
	}
}
