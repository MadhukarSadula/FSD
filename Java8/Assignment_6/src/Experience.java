import java.time.LocalDate;
import java.time.Period;

public class Experience {

	public Experience() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Experience obj=new Experience();
		obj.myExperience();

	}
	  public void myExperience() {
	      
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);
			
	      
	      LocalDate date2 = LocalDate.of(2016,06,27);
	      System.out.println("Date of joining: " + date2);
	      
	      Period period = Period.between(date2, date1);
	      System.out.println("Experience: " + period);
	   }
}
