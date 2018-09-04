package com.main;

import java.util.Random;

public class AccountDetails {
	
	public int acctNo;
	public String acctName;
	public float acctBalance; 
	
	public float Deposit(float amount )
	{
		acctBalance+=amount;
		//AccountDetails obj=new AccountDetails();
		//obj.creditCard();
		return acctBalance;
	}
	public float Withdraw(float amount)
	{
		if(acctBalance-amount>=0)
		{
			//AccountDetails obj=new AccountDetails();
			//obj.creditCard();
			acctBalance=acctBalance-amount;
			return acctBalance;
		}
		else
			return acctBalance;
		
	}
	public int creditCard()
	{
		Random ran = new Random();
		int x = ran.nextInt(55462887) + 50;
		return x;
		//(auto generate the credit card number whenever a transactions is made)
	}

}
