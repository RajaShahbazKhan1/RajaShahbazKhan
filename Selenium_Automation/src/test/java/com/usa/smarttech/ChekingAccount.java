package com.usa.smarttech;

public class ChekingAccount extends SavingAccount {

	protected void chekingDetails() {
		SavingAccount.Initialbalance = 2000;
		SavingAccount.deposit = 1000;
		SavingAccount.withdraw = 300;
		SavingAccount.blance = SavingAccount.Initialbalance + SavingAccount.deposit - SavingAccount.withdraw;
		System.out.println(" Customer total checking account money : " + SavingAccount.blance);

	}

}
