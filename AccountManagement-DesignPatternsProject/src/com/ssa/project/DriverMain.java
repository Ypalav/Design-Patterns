package com.ssa.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DriverMain {
	public static void main(String args[]) throws IOException {
		int ch = 0;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Select Your Account :");
		System.out.println("1. Account1 :");
		System.out.println("2. Account2 :");

		try {
			ch = (int) Float.parseFloat(buf.readLine());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("You have chosen: " + ch);

		switch (ch) {
		case 1: {
			Account1 account1 = new Account1();
			MDAEFSMContext mdaefsmContext = new MDAEFSMContext();
			OutputProcessor outputProcessor = new OutputProcessor();

			ATMState stateStart = new StateStart();
			ATMState stateCheckPin = new StateCheckPin();
			ATMState stateClose = new StateClose();
			ATMState stateIdle = new StateIdle();
			ATMState stateLocked = new StateLocked();
			ATMState stateOverdrawn = new StateOverdrawn();
			ATMState stateReady = new StateReady();
			ATMState stateS1 = new StateS1();
			ATMState stateSuspended = new StateSuspended();
			ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
			DataStore dataStore;
			dataStore = concreteFactory1.getData();
			account1.setMdaEfsm(mdaefsmContext);
			account1.setFactory(concreteFactory1);
			account1.setData(dataStore);
			stateStart.setOutputProcessor(outputProcessor);
			stateStart.setStateId(0);
			stateIdle.setOutputProcessor(outputProcessor);
			stateIdle.setStateId(1);
			stateCheckPin.setOutputProcessor(outputProcessor);
			stateCheckPin.setStateId(2);
			stateReady.setOutputProcessor(outputProcessor);
			stateReady.setStateId(3);
			stateS1.setOutputProcessor(outputProcessor);
			stateS1.setStateId(4);
			stateOverdrawn.setOutputProcessor(outputProcessor);
			stateOverdrawn.setStateId(5);
			stateLocked.setOutputProcessor(outputProcessor);
			stateLocked.setStateId(6);
			stateSuspended.setOutputProcessor(outputProcessor);
			stateSuspended.setStateId(7);
			stateClose.setOutputProcessor(outputProcessor);
			stateClose.setStateId(8);
			mdaefsmContext.setListOfStates(stateStart, stateIdle,
					stateCheckPin, stateReady, stateS1, stateOverdrawn,
					stateLocked, stateSuspended, stateClose);
			outputProcessor.setAbstractFactory(concreteFactory1);
			outputProcessor.setData(dataStore);
			String input = null;
			int i;
			while (true) { 
				System.out
						.println("Enter operation:  \n 1: Open 2. Pin 3. Deposit 4. Withdraw 5. Balance 6. Login 7. Logout 8. Lock 9. Unlock ");

				input = buf.readLine();
				i = Integer.parseInt(input);

				System.out.println("Chosen: " + i);

				switch (i) {
				case 1: 
					System.out.println("Enter pin, user id and balance");
					String a = buf.readLine();
					String b = buf.readLine();
					float c = Float.parseFloat(buf.readLine());
					account1.open(a, b, c);
					break;

				case 2: 
					System.out.println("Enter pin");
					String pin = buf.readLine();
					account1.pin(pin);
					break;
				case 3: 
					System.out.println("Enter deposit amount");
					float deposit = Float.parseFloat(buf.readLine());
					account1.deposit(deposit);
					break;

				case 4: 
					System.out.println("Enter Withdraw amount");
					float withdraw = Float.parseFloat(buf.readLine());
					account1.withdraw(withdraw);
					break;

				case 5: 
					account1.balance();
					break;

				case 6: 
					System.out.println("Enter Login id");
					String d = buf.readLine();
					account1.login(d);
					break;

				case 7: 
					account1.logout();
					break;

				case 8: 
					System.out.println("Enter Login id");
					String lockId = buf.readLine();
					account1.lock(lockId);
					System.out.println("Enter the login id to unlock");
					String lockState=buf.readLine();
					account1.unlock(lockState);
					break;
				case 9: 
					System.out.println("Enter Login id");
					String unlockId = buf.readLine();
					account1.unlock(unlockId);
					break;

				default:
					System.out.println("\n wrong choice, please try again");
				}
			}
		}
		case 2: {
			Account2 account2 = new Account2();
			MDAEFSMContext mdaefsmContext = new MDAEFSMContext();
			OutputProcessor outputProcessor = new OutputProcessor();

			ATMState stateStart = new StateStart();
			ATMState stateCheckPin = new StateCheckPin();
			ATMState stateClose = new StateClose();
			ATMState stateIdle = new StateIdle();
			ATMState stateLocked = new StateLocked();
			ATMState stateOverdrawn = new StateOverdrawn();
			ATMState stateReady = new StateReady();
			ATMState stateS1 = new StateS1();
			ATMState stateSuspended = new StateSuspended();
			ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
			DataStore dataStore;
			dataStore = concreteFactory2.getData();
			account2.setMdaEfsm(mdaefsmContext);
			account2.setFactory(concreteFactory2);
			account2.setData(dataStore);
			stateStart.setOutputProcessor(outputProcessor);
			stateStart.setStateId(0);
			stateIdle.setOutputProcessor(outputProcessor);
			stateIdle.setStateId(1);
			stateCheckPin.setOutputProcessor(outputProcessor);
			stateCheckPin.setStateId(2);
			stateReady.setOutputProcessor(outputProcessor);
			stateReady.setStateId(3);
			stateS1.setOutputProcessor(outputProcessor);
			stateS1.setStateId(4);
			stateOverdrawn.setOutputProcessor(outputProcessor);
			stateOverdrawn.setStateId(5);
			stateLocked.setOutputProcessor(outputProcessor);
			stateLocked.setStateId(6);
			stateSuspended.setOutputProcessor(outputProcessor);
			stateSuspended.setStateId(7);
			stateClose.setOutputProcessor(outputProcessor);
			stateClose.setStateId(8);
			mdaefsmContext.setListOfStates(stateStart, stateIdle,
					stateCheckPin, stateReady, stateS1, stateOverdrawn,
					stateLocked, stateSuspended, stateClose);
			outputProcessor.setAbstractFactory(concreteFactory2);
			outputProcessor.setData(dataStore);
			String input = null;
			int i;
			while (true) { 
				System.out
						.println("Enter operation:  \n 1: OPEN 2. PIN 3. DEPOSIT 4. WITHDRAW 5. BALANCE 6. LOGIN 7. LOGOUT 8. suspend 9. activate 10.close");

				input = buf.readLine();
				i = Integer.parseInt(input);

				System.out.println("Chosen: " + i);

				switch (i) {
				case 1: 
					System.out.println("Enter pin, user id and balance");
					int a = Integer.parseInt(buf.readLine());
					int b = Integer.parseInt(buf.readLine());
					int c = Integer.parseInt(buf.readLine());
					account2.OPEN(a, b, c);
					break;

				case 2: 
					System.out.println("Enter pin");
					int pin = Integer.parseInt(buf.readLine());
					account2.PIN(pin);
					break;
				case 3: 
					System.out.println("Enter deposit amount");
					int deposit = Integer.parseInt(buf.readLine());
					account2.DEPOSIT(deposit);
					break;
				case 4: 
					System.out.println("Enter Withdraw amount");
					int withdraw = Integer.parseInt(buf.readLine());
					account2.WITHDRAW(withdraw);
					break;

				case 5: 
					account2.BALANCE();
					break;

				case 6: 
					System.out.println("Enter Login id");
					int d = Integer.parseInt(buf.readLine());
					account2.LOGIN(d);
					;
					break;

				case 7: 
					account2.suspend();
					System.out.println("Enter the login id to activate");
					account2.activate();
					break;
				case 8: 
					account2.activate();
					break;

				default:
					System.out.println("\n wrong choice, please try again");
				}
			}

		}
		}
		/*
		 * account1.open("abc", "xyz", 100.5f); account1.login("xyz");
		 * account1.pin("abc"); account1.deposit(400); account1.balance();
		 * account1.logout();
		 */
	}
}
