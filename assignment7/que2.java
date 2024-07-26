/*Write a java program to read two numbers x and y and calculate x/(x-y). The program should check the value of x-y. Before dividing with x, it should throw an exception if x-y is zero. In the exception handler the program should display appropriate message to the user.*/
import java.util.*;
class que2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int x,y;
		System.out.println("Enter the two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		int res;
		try
		{
			res=x/(x-y);
			if((x-y)==0)
			{
				System.out.println("exception");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
			System.out.println(x/(x-y));
		}
		
	}
}
		
		