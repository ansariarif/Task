package com.neosoft;

public class Account {
	
	public static int acc_balance = 25000;
	
	public static void withdraw(int amount) throws WithDrawException {
		
		if(amount < acc_balance)
			acc_balance = acc_balance-amount;
		else
			throw new WithDrawException("can not withdraw as bslance is:"+acc_balance);
		
	}
	
	public static int showbalance() {
		return acc_balance;
	}

}
