
public class Instrument  implements Guitar,Piano
{

	
	public static void main(String[] args)
	{
		Instrument obj=new Instrument();
		obj.Play();
	}

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		 System.out.println("I am an Instrument");
	}

	
}