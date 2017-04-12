package com.ssa.project;
public class ConcreteFactory2 extends AbstractFactory {
	public DataStoreForAccount2 getData() {
		DataStoreForAccount2 dataStoreForAccount2 = new DataStoreForAccount2();
		return dataStoreForAccount2;
	}
	public ActionStoreData getStoreData() {
		ActionStoreData2 actionStoreData2 = new ActionStoreData2();
		return actionStoreData2;
	}
	public ActionDisplayBalance getDisplayBalance() {
		ActionDisplayBalance2 actionDisplayBalance2 = new ActionDisplayBalance2();
		return actionDisplayBalance2;
	}
	public ActionDisplayMenu getDisplayMenu() {
		ActionDisplayMenu2 actionDisplayMenu2 = new ActionDisplayMenu2();
		return actionDisplayMenu2;
	}
	public ActionIncorrectIDMessage getIncorrectIDMessage() {
		// TODO Auto-generated method stub
		ActionIncorrectIDMessage2 actionIncorrectIDMessage2 = new ActionIncorrectIDMessage2();
		return actionIncorrectIDMessage2;
	}
	public ActionIncorrectLockMsg getIncorrectLockMsg() {
		// TODO Auto-generated method stub
		ActionIncorrectLockMsg2 actionIncorrectLockMsg2 = new ActionIncorrectLockMsg2();
		return actionIncorrectLockMsg2;
	}
	public ActionIncorrectPinMsg getIncorrectPinMsg() {
		// TODO Auto-generated method stub
		ActionIncorrectPinMsg2 actionIncorrectPinMsg2 = new ActionIncorrectPinMsg2();
		return actionIncorrectPinMsg2;

	}
	public ActionIncorrectUnlockMsg getIncorrectUnlockMsg() {
		// TODO Auto-generated method stub
		ActionIncorrectUnlockMsg2 actionIncorrectUnlockMsg2 = new ActionIncorrectUnlockMsg2();
		return actionIncorrectUnlockMsg2;
	}
	public ActionMakeDeposit getMakeDeposit() {
		ActionMakeDeposit2 actionMakeDeposit2 = new ActionMakeDeposit2();
		return actionMakeDeposit2;
	}
	public ActionMakeWithdraw getMakeWithdraw() {
		// TODO Auto-generated method stub
		ActionMakeWithdraw2 actionMakeWithdraw2 = new ActionMakeWithdraw2();
		return actionMakeWithdraw2;
	}
	public ActionNoFundsMsg getNoFundsMsg() {
		ActionNoFundsMsg2 actionNoFundsMsg2 = new ActionNoFundsMsg2();
		return actionNoFundsMsg2;
	}
	public Actionpenalty getpenalty() {
		// TODO Auto-generated method stub
		return null;
	}
	public ActionPromptForPin getPromptForPin() {
		// TODO Auto-generated method stub
		ActionPromptForPin1 actionPromptForPin2 = new ActionPromptForPin1();
		return actionPromptForPin2;
	}
	public ActionTooManyAttemptsMsg getTooManyAttemptsMsg() {
		// TODO Auto-generated method stub
		ActionTooManyAttemptsMsg2 actionTooManyAttemptsMsg2 = new ActionTooManyAttemptsMsg2();
		return actionTooManyAttemptsMsg2;
	}
}
