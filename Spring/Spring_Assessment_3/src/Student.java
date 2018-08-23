
public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public String studentId;
	public String studentName;
	public String studentAddress;
	
	public void setStudentId(String id)
	{
		this.studentId=id;
	}
   public void setStudentName(String name)
   {
	   this.studentName=name;
   }
   public void setStudentAddress(String address)
   {
	   this.studentAddress=address;
   }
   public String getStudentId()
	{
		return this.studentId;
	}
   public String getStudentName()
   {
	  return this.studentName;
   }
   public String getStudentAddress( )
   {
	   return this.studentAddress;
   }
}
