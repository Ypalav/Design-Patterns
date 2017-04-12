package com.ssa.project;
public abstract class ATMState {
	int stateId;
	OutputProcessor outputProcessor;
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public void setOutputProcessor(OutputProcessor outputProcessor) {
		this.outputProcessor = outputProcessor;
	}
	public abstract void open();
	public abstract void Login();
	public abstract void IncorrectPin(int attempts,int max);
	public abstract void IncorrectLogin();
	public abstract void CorrectPinBelowMin();
	public abstract void CorrectPinAboveMin();
	public abstract void Deposit();
	public abstract void BelowMinBalance();
	public abstract void AboveMinBalance();
	public abstract void Logout();
	public abstract void Balance();
	public abstract void Withdraw();
	public abstract void WithdrawBelowMinBalance();
	public abstract void NoFunds();
	public abstract void Lock();
	public abstract void IncorrectLock();
	public abstract void Unlock();
	public abstract void IncorrectUnlock();
	public abstract void Suspend();
	public abstract void Activate();
	public abstract void Close();
}
