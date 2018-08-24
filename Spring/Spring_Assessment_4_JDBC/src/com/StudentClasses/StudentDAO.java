package com.StudentClasses;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
	 public Student getStudent(Integer id);
	 public void setDataSource(DataSource ds);
	   
	   /** 
	      * This is the method to be used to create
	      * a record in the Student table.
	   */
	   public void create(String name, String adress);
	   
	   public List<Student> listStudents();
	   
}
