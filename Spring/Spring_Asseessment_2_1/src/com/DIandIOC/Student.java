package com.DIandIOC;

public class Student {
	public String studentId;
	public String studentName;
	public Test test;
	
	public void setStudentId(String id)
	{
		this.studentId=id;
	}
   public void setStudentName(String name)
   {
	   this.studentName=name;
   }
  
   public void getStudentId()
	{
	   
	   System.out.println(this.studentId);
		//return this.studentId;
	}
   public void getStudentName()
   {
	   System.out.println(this.studentName);
	 // return this.studentName;
   }
   public void setTests(Test tests)
   {
	   this.test=tests;
   }
  
   public void getTests()
	{
	   System.out.println(this.test.getTestId());
	   System.out.println(this.test.getTestTitle());
	   System.out.println(this.test.getTestMarks());
		//return this.test;
	}
 
}
