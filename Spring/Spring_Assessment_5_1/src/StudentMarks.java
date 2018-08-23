
public class StudentMarks {

	public StudentMarks() {
		// TODO Auto-generated constructor stub
	}
	
		   private Integer science ;
		   private Integer maths ;
		   private Integer english;

		   public void setScienceMarks(Integer smarks) {
		      this.science = smarks;
		   }
		   public Integer getScienceMarks() {
		      return science;
		   }
		   public void setMathsMarks(Integer mmarks) {
			      this.maths = mmarks;
			   }
			   public Integer getMathsMarks() {
			      return maths;
			   } public void setEnglishMarks(Integer emarks) {
				      this.english = emarks;
			   }
			   public Integer getEnglishMarks() {
			      return english;
			   }
		public Integer  getResults()
		{
			return science+maths+english;
		}

}
