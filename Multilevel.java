class grandfather{
	void scooter(){
	System.out.println("Hiro");
	}
}
class father extends grandfather{
	void car(){
	System.out.println("tata");
	}
}
class son extends father{
	void bike(){
	System.out.println("Royal enfeild classic 350");
	}
}
public class Multilevel{
	public static void main(String args[])
	{
		son s=new son();
		s.scooter();
		s.car();
		s.bike();
	}
}