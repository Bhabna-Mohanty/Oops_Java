/*Write an exception handling java program to read two numbers n1, n2 and calculate and print the result of n1/n2. If n2 is Zero (0) then it will be handled by exception handler and again ask the value of n2. In the exception handler the program should display appropriate message to the user*/
import java.util.*;
class que1
{
	public static void main(String args[])
	{
		int n1,n2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		int res;
		try{
			res=n1/n2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero" +e);
			System.out.println("enter the value of n2");
			n2=sc.nextInt();
			System.out.println("The result is " +n1/n2);
		}
		
	}
}

				
			
		