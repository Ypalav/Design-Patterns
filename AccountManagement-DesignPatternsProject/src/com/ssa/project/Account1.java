package com.ssa.project;
public class Account1 {
	MDAEFSMContext mdaefsmContext;
	DataStore dataStore;
	AbstractFactory abstractFactory;
	//set reference to mda-efsm object
	public void setMdaEfsm(MDAEFSMContext mdaefsmContext) {this.mdaefsmContext = mdaefsmContext;}
	// Set reference to Concrete factory object
	public void setFactory(ConcreteFactory1 concreteFactory1) {		this.abstractFactory = concreteFactory1;}
	// Set reference to Datastore object
	public void setData(DataStore dataStore) {	this.dataStore = dataStore;}
	//accept inputs and store them in datastore
	public void open(String p, String y, float a) {	dataStore.setTemp_p(p);dataStore.setTemp_y(y);dataStore.setTemp_a(a);this.mdaefsmContext.open();}
//accept pin number with below given conditions in code also check for incorrect pin with max attempts scenario
	public void pin(String x) {
		if (x.equals(dataStore.getPin())) {
			if (dataStore.getBalance() > 500) {
				this.mdaefsmContext.CorrectPinAboveMin();
			} else {
				this.mdaefsmContext.CorrectPinBelowMin();
			}
		} else
			this.mdaefsmContext.IncorrectPin(3);
	}
	//deposit money 
	public void deposit(float a) {
		dataStore.setTemp_d(a);
		this.mdaefsmContext.Deposit();
		if (dataStore.getBalance() > 500) {
			this.mdaefsmContext.AboveMinBalance();
		} else {
			this.mdaefsmContext.BelowMinBalance();
		}
	}
	//withdraw money
	public void withdraw(float w) {
		dataStore.setTemp_w(w);
		this.mdaefsmContext.Withdraw();
		if (dataStore.getBalance() > 500)
			this.mdaefsmContext.AboveMinBalance();
		else
			this.mdaefsmContext.WithdrawBelowMinBalance();
	}
	//check balance
	public void balance() {
		this.mdaefsmContext.Balance();
	}
	//login to the app with login id 
	public void login(String y) {
		if (y.equals(dataStore.getUid())) {
			this.mdaefsmContext.Login();
		} else
			this.mdaefsmContext.IncorrectLogin();
	}
	//logout from the system and empty all the values
	public void logout() {
		this.mdaefsmContext.Logout();
		dataStore.setTemp_a(0);
		dataStore.setBalance(0);
		dataStore.setDepositAmount(0);
		dataStore.setPin("");
		dataStore.setTemp_a(0);
		dataStore.setTemp_d(0);
		dataStore.setTemp_p("");
		dataStore.setTemp_w(0);
		dataStore.setTemp_x("");
		dataStore.setTemp_y("");
		dataStore.setUid("");
		dataStore.setWithdrawAmount(0);
	}
	//lock the account 
	public void lock(String x) {
		if (dataStore.getPin().equals(x))
			this.mdaefsmContext.Lock();
			
		else
			this.mdaefsmContext.IncorrectLock();
	}
	//unlock the account with certain conditions
	public void unlock(String x) {
		if (x.equals(dataStore.getPin())) {
			this.mdaefsmContext.Unlock();
			if (dataStore.getBalance() > 500) {
				this.mdaefsmContext.AboveMinBalance();
			} else {
				this.mdaefsmContext.IncorrectUnlock();
			}
		}
	}
}
