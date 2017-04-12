package com.ssa.project;

public class DataStoreForAccount2 extends DataStore {
	int pin_2;
	int uID_2;
	int balance_2;
	int depositAmount_2;
	int withdrawAmount_2;
	int temp_p_2;
	int temp_y_2;
	int temp_a_2;
	int temp_x_2;
	int temp_d_2;
	int temp_w_2;

	int getDepositAmount_2() {
		// TODO Auto-generated method stub
		return depositAmount_2;
	}

	public void setDepositAmount_2(int depositAmount_2) {
		// TODO Auto-generated method stub
		this.depositAmount_2 = depositAmount_2;
	}

	int getWithdrawAmount_2() {
		// TODO Auto-generated method stub
		return withdrawAmount_2;
	}

	public void setWithdrawAmount_2(int withdrawAmount_2) {
		// TODO Auto-generated method stub
		this.withdrawAmount_2 = withdrawAmount_2;
	}

	public void computeDeposit_2() {
		// TODO Auto-generated method stub
		this.balance_2 = this.balance_2 + this.depositAmount_2;
	}

	public void computeWithdraw_2() {
		// TODO Auto-generated method stub
		this.balance_2 = this.balance_2 - this.withdrawAmount_2;
	}

	public int getBalance_2() {
		// TODO Auto-generated method stub
		return balance_2;
	}

	public void setBalance_2(int balance_2) {
		// TODO Auto-generated method stub
		this.balance_2 = balance_2;
	}

	public int getTemp_w_2() {
		// TODO Auto-generated method stub
		return temp_w_2;
	}

	void setTemp_w_2(int temp_w_2) {
		// TODO Auto-generated method stub
		this.temp_w_2 = temp_w_2;
	}

	public int getTemp_y_2() {
		// TODO Auto-generated method stub
		return temp_y_2;
	}

	public int getTemp_p_2() {
		// TODO Auto-generated method stub
		return temp_p_2;
	}

	public int getTemp_a_2() {
		// TODO Auto-generated method stub
		return temp_a_2;
	}

	void setTemp_y_2(int temp_y_2) {
		// TODO Auto-generated method stub
		this.temp_y_2 = temp_y_2;
	}

	void setTemp_p_2(int temp_p_2) {
		// TODO Auto-generated method stub
		this.temp_p_2 = temp_p_2;
	}

	void setTemp_a_2(int temp_a_2) {
		// TODO Auto-generated method stub
		this.temp_a_2 = temp_a_2;
	}

	int getPin_2() {
		// TODO Auto-generated method stub
		return pin_2;
	}

	public void setPin_2(int pin_2) {
		// TODO Auto-generated method stub
		this.pin_2 = pin_2;
	}

	void setTemp_d_2(int temp_d_2) {
		// TODO Auto-generated method stub
		this.temp_d_2 = temp_d_2;
	}

	public int getTemp_d_2() {
		// TODO Auto-generated method stub
		return temp_d_2;
	}

	int getUid_2() {
		// TODO Auto-generated method stub
		return uID_2;
	}

	public void setUid_2(int uId_2) {
		// TODO Auto-generated method stub
		this.uID_2 = uId_2;
	}

}
