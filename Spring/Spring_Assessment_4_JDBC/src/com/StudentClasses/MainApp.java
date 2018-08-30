package com.StudentClasses;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.StudentClasses.StudentJDBCTemplate;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      StudentJDBCTemplate studentJDBCTemplate = 
         (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
      
      System.out.println("------Records Creation--------" );
      studentJDBCTemplate.create("Zara", "Hyd1");
      studentJDBCTemplate.create("Nuha", "Hyd11");
      studentJDBCTemplate.create("Ayan", "Hyd111");

      System.out.println("------Listing Multiple Records--------" );
      List<Student> students = studentJDBCTemplate.listStudents();
      
      for (Student record : students) {
         System.out.print("ID : " + record.getStudentId() );
         System.out.print(", Name : " + record.getStudentName() );
         System.out.println(", Age : " + record.getStudentAddress());
      }

      

      System.out.println("----Listing Record with ID = 2 -----" );
      Student student = studentJDBCTemplate.getStudent(2);
      System.out.print("ID : " + student.getStudentId() );
      System.out.print(", Name : " + student.getStudentName() );
      System.out.println(", Address : " + student.getStudentAddress());
   }
}
