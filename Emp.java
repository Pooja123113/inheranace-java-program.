class Address{
	String country,state;
	int pincode;
	
public Address(int pincode,String country,String state)	
	{
	this.pincode=pincode;
	this.country=country;
	this.state=state;

	}
}
class Emp
	{
		int id;
		String name;
		Address addr;
	public Emp(int id,String name,Address addr)
	{
	 this.id=id;
	 this.name=name;
	 this.addr=addr;	
	}	
void display()
	{
	System.out.println("id is "+id);
	System.out.println("Name is "+name);
	System.out.println("country is "+addr.country);
	System.out.println("state is "+addr.state);
	System.out.println("pincode is "+addr.pincode);
	}	
	public static void main(String args[])
	{
		Address ad1=new Address(110044,"India","Delhi");
		Emp tom=new Emp(1,"tom jerry",ad1);
		tom.display();
	}
}