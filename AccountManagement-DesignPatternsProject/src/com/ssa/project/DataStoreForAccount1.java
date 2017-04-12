package com.ssa.project;
public class DataStoreForAccount1 extends DataStore {
	String pin;
	String uID;
	float balance;
	float depositAmount;
	float withdrawAmount;
	String temp_p;
	String temp_y;
	float temp_a;
	String temp_x;
	float temp_d;
	float temp_w;
	public void computeDeposit() {
		this.balance = this.balance + this.depositAmount;
	}
	public void computeWithdraw() {
		this.balance = this.balance - this.withdrawAmount;
		if(this.balance <= 500){
			setPenalty();
		}	
	}
	public float getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(float depositAmount) {
		this.depositAmount = depositAmount;
	}
	public float getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(float withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	String getUid() {
		return uID;
	}
	public void setUid(String uID) {
		this.uID = uID;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getTemp_p() {
		return temp_p;
	}
	public void setTemp_p(String temp_p) {
		this.temp_p = temp_p;
	}
	public String getTemp_y() {
		return temp_y;
	}

	public void setTemp_y(String temp_y) {
		this.temp_y = temp_y;
	}
	public float getTemp_a() {
		return temp_a;
	}

	public void setTemp_a(float temp_a) {
		this.temp_a = temp_a;
	}

	public String getTemp_x() {
		return temp_x;
	}

	public void setTemp_x(String temp_x) {
		this.temp_x = temp_x;
	}

	public float getTemp_d() {
		return temp_d;
	}

	public void setTemp_d(float temp_d) {
		this.temp_d = temp_d;
	}

	public float getTemp_w() {
		return temp_w;
	}

	public void setTemp_w(float temp_w) {
		this.temp_w = temp_w;
	}

	public float setPenalty() {
		this.balance = this.balance - 10;
		return this.balance;
	}

}
