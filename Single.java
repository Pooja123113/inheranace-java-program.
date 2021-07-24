class Parent{
	void rose(){
	System.out.println("red");
	}
}
class Child extends Parent{
	void marrigold()
	{
	System.out.println("yellow");
	}
}
public class Single{
	public static void main(String[]args)
	{
		Child c=new Child();
		c.rose();
		c.marrigold();
	}
	
	
}