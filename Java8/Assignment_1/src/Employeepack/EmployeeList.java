package Employeepack;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Employee> empArrList=new ArrayList<Employee>();
     Scanner sc=new Scanner(System.in); 
     System.out.println("enter number of employees you want to add");
     int empnum=sc.nextInt();
     for(int i=0;i<empnum;i++)
     {
    	 Employee empobj=new Employee();
    	 System.out.println("enter employee"+i+": id:");
    	 empobj.id=sc.nextInt();
    	 System.out.println("enter employee"+i+": name:");
    	 empobj.Name=sc.next();
    	 System.out.println("enter employee"+i+": address:");
    	 empobj.address=sc.next();
    	 System.out.println("enter employee"+i+": salary:");
    	 empobj.sal=sc.nextLong();
    	 empArrList.add(empobj);
     }
     for(Employee obj : empArrList)
     {
    	 int i=1;
       	 System.out.println("employee"+i+": id:"+ obj.id);
       	 System.out.println(" employee"+i+": name:"+obj.Name);
       	System.out.println(" employee"+i+": address:"+obj.address);
       	System.out.println(" employee"+i+": salary:"+obj.sal);
       	i++;
       	
     }
     
     sc.close();
	}

}
