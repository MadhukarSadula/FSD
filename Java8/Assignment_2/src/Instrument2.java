
public class Instrument2  implements Guitar,Piano{

	public Instrument2()  {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument2 obj=new Instrument2();
		obj.Play();

	}

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		Guitar.super.Play();
		Piano.super.Play();
	}

}
