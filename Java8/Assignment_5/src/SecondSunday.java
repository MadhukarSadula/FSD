import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondSunday {

	public SecondSunday() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		SecondSunday obj=new SecondSunday();
		obj.getdate();

	}
	public void getdate() {
	   
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);
			
	      LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
	      LocalDate secondSunday = firstInYear.with(TemporalAdjusters.nextOrSame(
	         DayOfWeek.SUNDAY)).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
	      System.out.println("Second Sunday on : " + secondSunday);
	   }

}
