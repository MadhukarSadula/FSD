package com.main;

public class Book {
	
	public double discountedPrice(int price,double discount) 
	{
		double res=(discount*price)/100;
		return res;
	}

}
