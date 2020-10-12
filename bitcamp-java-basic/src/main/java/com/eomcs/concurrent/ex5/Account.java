package com.eomcs.concurrent.ex5;

public class Account {
	String accountId;
	long balance;
	
	public Account(String accountId, long balance) {
		this.accountId = accountId;
		this.balance = balance;
	}
	
	synchronized public long withdraw(long money) {
		long b = this.balance;
		
		b -= money;
		
		if (b < 0) 
			return 0;
		
		this.balance = b;
		
		return money;
	}
	
}
