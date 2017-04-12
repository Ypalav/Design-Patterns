package com.ssa.project;

public abstract class AbstractFactory {
	public abstract ActionStoreData getStoreData();
	public abstract ActionDisplayBalance getDisplayBalance();
	public abstract ActionDisplayMenu getDisplayMenu();
	public abstract ActionIncorrectIDMessage getIncorrectIDMessage();
	public abstract ActionIncorrectLockMsg getIncorrectLockMsg();
	public abstract ActionIncorrectPinMsg getIncorrectPinMsg();
	public abstract ActionIncorrectUnlockMsg getIncorrectUnlockMsg();
	public abstract ActionMakeDeposit getMakeDeposit();
	public abstract ActionMakeWithdraw getMakeWithdraw();
	public abstract ActionNoFundsMsg getNoFundsMsg();
	public abstract Actionpenalty getpenalty();
	public abstract ActionPromptForPin getPromptForPin();
	public abstract ActionTooManyAttemptsMsg getTooManyAttemptsMsg();
}
