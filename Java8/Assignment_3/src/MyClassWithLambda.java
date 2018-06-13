import java.util.Scanner;


public class MyClassWithLambda  {

	
	public MyClassWithLambda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str="madhukar sadula 123 abc def";
        
	       Wordcount Iobj=(String str1)->{
	     		if (str1 == null || str1.isEmpty())
	    		{ return 0; }
	    		String[] words = str.split(" "); 
	    		return words.length; 

	    	
	    	};
	        int count1=Iobj.count(str);
	   
	         System.out.println("number of words:"+count1);
	      
		}

	interface Wordcount {
		 public int count(String str);
	}

 
}
