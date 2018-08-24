import java.util.ArrayList;

public class MethodsExecution {
	public  void	getAllDetails(ArrayList<Student> students)
	 { int i=0;
		 for(Student std:students)
		 { i++;
			System.out.println("Student :"+i); 
			System.out.println("ID :"+std.getStudentId()); 
			System.out.println("Name :"+std.getStudentName()); 
			System.out.println("Address :"+std.getStudentAddress()); 
		 }
	 }
	 public  void	StudentSearch(ArrayList<Student> students,String id)
	 {
		 int flag=0;
		 Student std1=new Student();
		 for(Student std: students)
		 {
			 if(std.studentId==id)
			 {
				flag=1;
				std1=std;
			 }
		 }
		 if(flag==1)
		 {
			 System.out.println("Student details with :"+id); 
				System.out.println("ID :"+std1.getStudentId()); 
				System.out.println("Name :"+std1.getStudentName()); 
				System.out.println("Address :"+std1.getStudentAddress()); 
		 }
		 else
		 {
			 System.out.println("Student is not present in the class"); 
				 
		 }
	 }
}
