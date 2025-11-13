package skillBuilders;

public class TestStudent {

	public static void main(String[] args) 
	{
		Student stA = new Student();
		
		System.out.println(stA.getFirstName());
		stA.setFirstName("AAA");
		System.out.println(stA.getFirstName());
		stA.setStuID(676941);
		System.out.println(stA.getStuID());
	}

}
