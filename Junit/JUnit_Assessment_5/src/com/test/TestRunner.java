package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
public static void main(String[] args)
{
Result result=JUnitCore.runClasses(ParameterizedPriceTest.class);
for(Failure failure:result.getFailures())
{
	System.out.println("failed test case description:"+failure.toString());
    System.out.println("Failed test cases:"+result.getFailureCount());
    System.out.println("Passed test cases:"+ (result.getRunCount()-result.getFailureCount()+result.getIgnoreCount()));
    
    
 
}
System.out.println(result.wasSuccessful());
}

}
