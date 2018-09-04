package com.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccountDetails obj=new AccountDetails();
obj.acctNo=456378;
obj.acctName="madhukar";
obj.acctBalance=(float) 6399908245.0;
System.out.println("Withdraw transaction:" +obj.Withdraw(4500));
System.out.println("Deposit transaction:"+obj.Deposit(800000));
System.out.println("Credit card number transaction:"+obj.creditCard());



	}

}
