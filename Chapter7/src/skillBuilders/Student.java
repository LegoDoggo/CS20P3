package skillBuilders;

public class Student 
{
	private String firstName;
	private String lastName;
	private String address;
	private int stuID;
	
	public Student()//Constructor method
	{
		firstName = "Unknown";
		lastName = "Unknown";
		address = "####";
		stuID = 000000;
	}
	
	public Student(String f, String l, String a, int id)//Overload Constructor
	{
		firstName = f;
		lastName = l;
		address = a;
		stuID = id;
	}
	
	//Accessor methods
	
	//Get around the private variable
	public String getFirstName()
	{
		return firstName;
	}
	
	//Get around the private variable
	public String getLastName()
	{
		return lastName;
	}
	
	//Get around the private variable
	public String getAddress()
	{
		return address;
	}
	
	//Get around the private variable
	public int getStuID()
	{
		return stuID;
	}
	
	//Modifier methods
	public void setFirstName(String f)
	{
		firstName = f;
	}
	
	public void setLastName(String l)
	{
		lastName = l;
	}
	
	public void setAddress(String a)
	{
		address = a;
	}
	
	public void setStuID(int s)
	{
		stuID = s;
	}
	
	public String toString()
	{
		return ("First name: " + firstName + 
		"Last name: " + lastName +
		"Address: " + address +
		"Student ID: " + stuID);
		
	}
	
	
}
