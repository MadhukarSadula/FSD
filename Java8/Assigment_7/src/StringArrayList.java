import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;



public class StringArrayList {

	public StringArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> ArrList=new List<String>();
	     Scanner sc=new Scanner(System.in); 
	     System.out.println("enter number of Strings you want to add");
	     int num=sc.nextInt();
	     for(int i=0;i<num;i++)
	     {
	    
	    	 System.out.println("enter String :"+i+":");
	    	 ArrList.add(sc.next());
	     }
	     long count1 = ArrList.stream().filter(str->str.length()>5).count();
	     System.out.println("No of strings whose length  is> 5:"+count1);
	     long count2 = ArrList.stream().filter(str->str.isEmpty()).count();
	     System.out.println("No of empty Strings:"+count2);
	     
	     List<String> filtered = ArrList.stream().filter(string ->string.isEmpty()).collect(Collectors.toList());
	     System.out.println("length of  empty Strings List:"+filtered.size());
	}

}
