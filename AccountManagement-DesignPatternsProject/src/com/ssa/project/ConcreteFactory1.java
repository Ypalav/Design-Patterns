package com.ssa.project;
public class ConcreteFactory1 extends AbstractFactory {
	public DataStoreForAccount1 getData() {
		DataStoreForAccount1 dataStoreForAccount1 = new DataStoreForAccount1();
		return dataStoreForAccount1;
	}
	public ActionStoreData getStoreData() {
		// TODO Auto-generated method stub
		ActionStoreData1 actionStoreData1 = new ActionStoreData1();
		return actionStoreData1;
	}
	public ActionDisplayBalance getDisplayBalance() {
		ActionDisplayBalance1 actionDisplayBalance1 = new ActionDisplayBalance1();
		return actionDisplayBalance1;
	}
	public ActionDisplayMenu getDisplayMenu() {
		// TODO Auto-generated method stub
		ActionDisplayMenu1 actionDisplayMenu1 = new ActionDisplayMenu1();
		return actionDisplayMenu1;
	}
	public ActionIncorrectIDMessage getIncorrectIDMessage() {
		// TODO Auto-generated method stub
		ActionIncorrectIDMessage1 actionIncorrectIDMessage1=new ActionIncorrectIDMessage1();
		return actionIncorrectIDMessage1;
	}
	public ActionIncorrectLockMsg getIncorrectLockMsg() {
		// TODO Auto-generated method stub
		ActionIncorrectLockMsg1 actionIncorrectLockMsg1= new ActionIncorrectLockMsg1();
		return actionIncorrectLockMsg1;
	}
	public ActionIncorrectPinMsg getIncorrectPinMsg() {
		ActionIncorrectPinMsg1 actionIncorrectPinMsg1 = new ActionIncorrectPinMsg1();
		return actionIncorrectPinMsg1;
	}
	public ActionIncorrectUnlockMsg getIncorrectUnlockMsg() {
		// TODO Auto-generated method stub
		ActionIncorrectUnlockMsg1 actionIncorrectUnlockMsg1= new ActionIncorrectUnlockMsg1();
		return actionIncorrectUnlockMsg1;
	}
	public ActionMakeDeposit getMakeDeposit() {
		ActionMakeDeposit1 actionMakeDeposit1 = new ActionMakeDeposit1();
		return actionMakeDeposit1;
	}
	public ActionMakeWithdraw getMakeWithdraw() {
		// TODO Auto-generated method stub
		ActionMakeWithdraw1 actionMakeWithdraw1=new ActionMakeWithdraw1();
		return actionMakeWithdraw1;
	}
	public ActionNoFundsMsg getNoFundsMsg() {
		// TODO Auto-generated method stub
		ActionNoFundsMsg1 actionNoFundsMsg1=new ActionNoFundsMsg1();
		return actionNoFundsMsg1;
	}
	public Actionpenalty getpenalty() {
		// TODO Auto-generated method stub
		Actionpenalty1 actionpenalty1=new Actionpenalty1();
		return actionpenalty1;
	}
	public ActionPromptForPin getPromptForPin() {
		ActionPromptForPin1 actionPromptForPin1 = new ActionPromptForPin1();

		return actionPromptForPin1;
	}
	public ActionTooManyAttemptsMsg getTooManyAttemptsMsg() {
		// TODO Auto-generated method stub
		ActionTooManyAttemptsMsg1 actionTooManyAttemptsMsg1=new ActionTooManyAttemptsMsg1();
		return actionTooManyAttemptsMsg1;
	}
}
