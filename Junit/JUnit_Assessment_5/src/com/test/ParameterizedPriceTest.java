package com.test;
import com.main.*;

import junit.framework.Assert;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class ParameterizedPriceTest {

	private int price;
	private double discount;
	private Book book;
	@Before()
	public void initialize()
	{
		book=new Book();
	}
	public ParameterizedPriceTest(int prs,double dis)
	{
		this.price=prs;
		this.discount=dis;
	}
	@Parameterized.Parameters
	public static Collection bookpriceanddis()
	{
		return  Arrays.asList(new Object[][]{
			{100,10},{200,15},{300,30},{400,10},{500,25},{1000,25}	
		});
	}
	@Test
	public void TestdiscountedPrice(){
		System.out.println("Parameterized price is : " + price+ "Parameterized discount is :"+discount);
	  double expectedResult=(discount*price)/100;
	  assertEquals(expectedResult,book.discountedPrice(price, discount),0.0);
	}
}
