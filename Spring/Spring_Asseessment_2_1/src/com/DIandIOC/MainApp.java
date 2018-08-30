package com.DIandIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student stdobj=(Student)context.getBean("Student");
		stdobj.setStudentId("MA12345");
		stdobj.setStudentName("madhukar");
		Test obj=new Test();
		obj.setTestId("test1");
		obj.setTestTitle("maths");
		obj.setTestMarks(80);
		stdobj.setTests(obj);
		stdobj.getStudentId();
		stdobj.getStudentName();
		stdobj.getTests();
	}

}
