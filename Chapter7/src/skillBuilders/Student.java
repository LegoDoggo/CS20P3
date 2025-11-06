package skillBuilders;

public class Student 
{
	private String firstName;
	private String lastName;
	private String address;
	private int stuID;
	
	public Student()//Constructor method
	{
		firstName = " ";
		lastName = " ";
		address = "####";
		stuID = 000000;
	}
	
	public Student(String f, String l, String a, int id)//Overload Constructor
	{
		firstName = "f";
		lastName = "l";
		address = "a";
		stuID = id;
	}
	
}
