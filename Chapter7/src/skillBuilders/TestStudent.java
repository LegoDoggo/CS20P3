package skillBuilders;

public class TestStudent {

	public static void main(String[] args) 
	{
		Student stA = new Student();
		
		System.out.println(stA.getFirstName());
		System.out.println(stA.getLastName());
		System.out.println(stA.getAddress());
		System.out.println(stA.getStuID());
		
		System.out.println("-------------------");
		
		Student stB = new Student("Derek", "Jake", "67 MK St", 123456789);
		
		System.out.println(stB.getFirstName());
		System.out.println(stB.getLastName());
		System.out.println(stB.getAddress());
		System.out.println(stB.getStuID());
		
		stB.setFirstName("Omar");
		System.out.print(stB);
	}
}
