package com.ssa.project;

public class StateCheckPin extends ATMState {
	//OutputProcessor outputProcessor;
	public void open() {
		// TODO Auto-generated method stub
		
	}

	public void Login() {
		// TODO Auto-generated method stub
		
	}

	public void IncorrectLogin() {
		// TODO Auto-generated method stub
		
	}

	public void CorrectPinBelowMin() {
		// TODO Auto-generated method stub
		outputProcessor.displayMenu();
	}

	public void CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		outputProcessor.displayMenu();
	}

	public void Deposit() {
		// TODO Auto-generated method stub
		
	}

	public void BelowMinBalance() {
		// TODO Auto-generated method stub
		
	}

	public void AboveMinBalance() {
		// TODO Auto-generated method stub
		
	}

	public void Logout() {
		// TODO Auto-generated method stub
		
	}

	public void Balance() {
		// TODO Auto-generated method stub
		
	}

	public void Withdraw() {
		// TODO Auto-generated method stub
		
	}

	public void WithdrawBelowMinBalance() {
		// TODO Auto-generated method stub
		
	}

	public void NoFunds() {
		// TODO Auto-generated method stub
		
	}

	public void Lock() {
		// TODO Auto-generated method stub
		
	}

	public void IncorrectLock() {
		// TODO Auto-generated method stub
		
	}

	public void Unlock() {
		// TODO Auto-generated method stub
		
	}

	public void IncorrectUnlock() {
		// TODO Auto-generated method stub
		
	}

	public void Suspend() {
		// TODO Auto-generated method stub
		
	}

	public void Activate(){}

	public void Close() {
		// TODO Auto-generated method stub
		
	}

	public void IncorrectPin(int attempts,int max) {
		// TODO Auto-generated method stub
		if(attempts<max){
		outputProcessor.incorrectPinMsg();
		}else{
		outputProcessor.tooManyAttemptsMsg();
		}
	}

}