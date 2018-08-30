package com.DIandIOC;

public class Test {
	
 private String testId;	
 private String testTitle;
 private int testMarks;
 
 public void setTestId(String id)
 {
	 this.testId=id;
	
 }
 public void setTestTitle(String title)
 {
	 this.testTitle=title;
 }
 public void setTestMarks(int marks)
 {
	 this.testMarks=marks;
 }

 public String getTestId()
 {
	 return this.testId;
 }
 public String getTestTitle()
 {
	 return this.testTitle;
 }
 public int getTestMarks()
 {
	 return this.testMarks;
 }


}
