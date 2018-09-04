package com.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.main.*;


public class TestDeposit {
	
	@Test
	public void testdepositfunction()
	{
	AccountDetails obj=new AccountDetails();
	obj.acctNo=456378;
	obj.acctName="madhukar";
	obj.acctBalance=(float) 1000000000.0;
	float res=obj.Deposit(450000);
	float expected=(float) (1000000000.0+450000.0);
assertEquals(expected, res,0.0);
	}
	
}
