package skillBuilders;

public class TestRectangle {

	public static void main(String[] args) 
	{
		Rectangle sqr = new Rectangle();
		
		System.out.println("The area is: " + sqr.area());
		System.out.println("The perimeter is: " + sqr.perimeter());
		Rectangle.displayAreaFormula();
		
		Rectangle sqr1 = new Rectangle(3, 4);
		Rectangle sqr2 = new Rectangle(4, 3);
		
		if (sqr1.equals(sqr2))
		{
			System.out.println("Objects are equal.");
		}
		
		else
		{
			System.out.println("Objects are not equal");
		}
		
		System.out.println(sqr1);
		System.out.println(sqr2);
	}

}
