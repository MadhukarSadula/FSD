package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.AccountDetails;

public class TestWithdraw {
	@Test
	public void testWithdrawfunction()
	{
	AccountDetails obj=new AccountDetails();
	obj.acctNo=456378;
	obj.acctName="madhukar";
	obj.acctBalance=(float) 1000000000.0;
	float res=(float)obj.Withdraw(4500);
	float expected=(float) (1000000000.0-4500.0);
	assertEquals(expected, res,0.0);

	}
}
