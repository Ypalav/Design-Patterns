package com.ssa.project;

public class OutputProcessor {
	DataStore dataStore;
	AbstractFactory abstractFactory;

	// set the pointer abstract factory to the concretefactory object argument
	public void setAbstractFactory(AbstractFactory abstractFactory) {
		this.abstractFactory = abstractFactory;
	}

	// set the pointer to the passed data object argument
	public void setData(DataStore dataStore) {
		this.dataStore = dataStore;
	}

	// get the specific concrete factory and call its method
	public void storeData() {
		ActionStoreData actionStoreData;
		actionStoreData = abstractFactory.getStoreData();
		actionStoreData.setData(dataStore);
		actionStoreData.storeData();

	}

	public void incorrectIdMessage() {
		ActionIncorrectIDMessage actionIncorrectIDMessage;
		actionIncorrectIDMessage = abstractFactory.getIncorrectIDMessage();
		actionIncorrectIDMessage.incorrectIDMessage();
	}

	public void incorrectPinMsg() {
		ActionIncorrectPinMsg actionIncorrectPinMsg;
		actionIncorrectPinMsg = abstractFactory.getIncorrectPinMsg();
		actionIncorrectPinMsg.IncorrectPinMsg();
	}

	public void tooManyAttemptsMsg() {
		ActionTooManyAttemptsMsg actionTooManyAttemptsMsg;
		actionTooManyAttemptsMsg = abstractFactory.getTooManyAttemptsMsg();
		actionTooManyAttemptsMsg.tooManyAttemptsMsg();
	}

	public void displayMenu() {
		ActionDisplayMenu actionDisplayMenu;
		actionDisplayMenu = abstractFactory.getDisplayMenu();
		actionDisplayMenu.displayMenu();
	}

	public void makeDeposit() {
		ActionMakeDeposit actionMakeDeposit;
		actionMakeDeposit = abstractFactory.getMakeDeposit();
		actionMakeDeposit.setData(dataStore);
		actionMakeDeposit.makeDeposit();
	}

	public void displayBalance() {
		ActionDisplayBalance actionDisplayBalance;
		actionDisplayBalance = abstractFactory.getDisplayBalance();
		actionDisplayBalance.setData(dataStore);
		actionDisplayBalance.displayBalance();
	}

	public void promptForPin() {
		ActionPromptForPin actionPromptForPin;
		actionPromptForPin = abstractFactory.getPromptForPin();
		actionPromptForPin.promptForPin();
	}

	public void makeWithdraw() {
		ActionMakeWithdraw actionMakeWithdraw;
		actionMakeWithdraw = abstractFactory.getMakeWithdraw();
		actionMakeWithdraw.setData(dataStore);
		actionMakeWithdraw.makeWithdraw();
	}

	public void displayNoFundsMessage() {
		ActionNoFundsMsg actionnofundsmsg;
		actionnofundsmsg = abstractFactory.getNoFundsMsg();
		// actionnofundsmsg.setData(dataStore);
		actionnofundsmsg.displayNoFundsMessage();
	}

	public void penalty() {
		Actionpenalty actionpenalty;
		actionpenalty = abstractFactory.getpenalty();
		actionpenalty.setData(dataStore);
		actionpenalty.penalty();
	}

	public void incorrectLockMsg() {
		ActionIncorrectLockMsg actionIncorrectLockMsg;
		actionIncorrectLockMsg = abstractFactory.getIncorrectLockMsg();
		actionIncorrectLockMsg.incorrectLockMsg();
	}

	public void incorrectUnlockMsg() {
		ActionIncorrectUnlockMsg actionIncorrectUnlockMsg;
		actionIncorrectUnlockMsg = abstractFactory.getIncorrectUnlockMsg();
		actionIncorrectUnlockMsg.incorrectUnlockMsg();
	}

	public void noFundsMsg() {

	}
}
