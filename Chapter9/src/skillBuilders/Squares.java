package skillBuilders;

public class Squares {

	public static void main(String[] args) 
	{
		//Initialize array
		int[] squareRay = new int[5];
			
		//Loop for squaring indexes
		for (int i = 0; i < squareRay.length; i++)
		{
			squareRay[i] = i * i;
		}
		
		//Display all the squares
        for (int i = 0; i < squareRay.length; i++)
        {
            System.out.println(squareRay[i]);
        }

	}

}
