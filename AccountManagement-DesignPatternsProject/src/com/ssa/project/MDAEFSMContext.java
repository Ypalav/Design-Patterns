package com.ssa.project;

public class MDAEFSMContext {
	ATMState currentAtmState;
	ATMState[] listOfATMStates = new ATMState[9];
	int attempts;

	public void setState(ATMState atmStates) {
		currentAtmState = atmStates;
	}

	// list of states which get passed as parameters and this function stores
	// the states in a list
	public void setListOfStates(ATMState a, ATMState b, ATMState c, ATMState d,
			ATMState e, ATMState f, ATMState g, ATMState h, ATMState i) {
		listOfATMStates[0] = a;
		listOfATMStates[1] = b;
		listOfATMStates[2] = c;
		listOfATMStates[3] = d;
		listOfATMStates[4] = e;
		listOfATMStates[5] = f;
		listOfATMStates[6] = g;
		listOfATMStates[7] = h;
		listOfATMStates[8] = i;
		this.currentAtmState = listOfATMStates[0];
	}

	public void open() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			currentAtmState.open();
			currentAtmState = listOfATMStates[1];
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void Login() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			attempts = 0;
			currentAtmState.Login();
			currentAtmState = listOfATMStates[2];
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void IncorrectPin(int max) {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			if (attempts < max) {
				attempts++;
				currentAtmState.IncorrectPin(attempts,max);
				currentAtmState = listOfATMStates[2];
			}
			if (attempts == max) {
				currentAtmState.IncorrectPin(attempts,max);
				currentAtmState = listOfATMStates[1];
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
	
		}
		;
	}

	public void IncorrectLogin() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			currentAtmState.IncorrectLogin();
			currentAtmState = listOfATMStates[1];
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void CorrectPinBelowMin() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			currentAtmState.CorrectPinBelowMin();
			currentAtmState = listOfATMStates[5];
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void CorrectPinAboveMin() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			currentAtmState.CorrectPinAboveMin();
			currentAtmState = listOfATMStates[3];
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void Deposit() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			currentAtmState.Deposit();
			currentAtmState = listOfATMStates[3];
			break;
		case 4:
			break;
		case 5:
			currentAtmState.Deposit();
			currentAtmState = listOfATMStates[4];
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void BelowMinBalance() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			//currentAtmState.BelowMinBalance();
			
			break;
		case 5:
			currentAtmState = listOfATMStates[5];
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void AboveMinBalance() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			//currentAtmState.AboveMinBalance();
			currentAtmState = listOfATMStates[3];
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void Logout() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			currentAtmState.Logout();
			
			currentAtmState = listOfATMStates[1];
			
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void Balance() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			currentAtmState.Balance();
			currentAtmState = listOfATMStates[3];
			break;
		case 4:
			break;
		case 5:
			currentAtmState.Balance();
			currentAtmState = listOfATMStates[5];
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void Withdraw() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			currentAtmState.Withdraw();
			currentAtmState = listOfATMStates[4];
			break;
		case 4:
			break;
		case 5:
			currentAtmState.Withdraw();
			currentAtmState = listOfATMStates[5];
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void WithdrawBelowMinBalance() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			currentAtmState.WithdrawBelowMinBalance();
			currentAtmState = listOfATMStates[5];
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void NoFunds() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			currentAtmState.NoFunds();
			currentAtmState = listOfATMStates[3];
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void Lock() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:

			break;
		case 2:
			break;
		case 3:
			currentAtmState.Lock();
			currentAtmState = listOfATMStates[6];
			
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void IncorrectLock() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			currentAtmState.IncorrectLock();
			currentAtmState = listOfATMStates[3];
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void Unlock() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			currentAtmState.Unlock();
			currentAtmState = listOfATMStates[4];
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void IncorrectUnlock() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			currentAtmState.IncorrectUnlock();
			currentAtmState = listOfATMStates[6];
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void Suspend() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			currentAtmState.Suspend();
			currentAtmState = listOfATMStates[7];
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		;
	}

	public void Activate() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			currentAtmState.Activate();
			currentAtmState = listOfATMStates[3];
			break;
		case 8:
			break;

		}
		;
	}

	public void Close() {
		int currState = currentAtmState.getStateId();
		switch (currState) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			currentAtmState.Close();
			currentAtmState = listOfATMStates[8];
			break;
		}
		;
	}
}
