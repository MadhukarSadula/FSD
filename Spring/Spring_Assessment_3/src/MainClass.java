import java.awt.List;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mainobj=new MainClass();
     ArrayList<Student> liststudent=new ArrayList<Student>();
     for(int i=0;i<10;i++)
     {
    	 Student obj=new Student();
    	 String id="STD00"+i;
    	 String name="student"+i;
    	String address="Hyderbad,location"+i;
    	 obj.setStudentId(id);
    	 obj.setStudentName(name);
    	 obj.setStudentAddress(address);
    	 liststudent.add(obj);
    	 
     }
     
     mainobj.getAllDetails(liststudent);
     
	}
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
	 
 }
}
