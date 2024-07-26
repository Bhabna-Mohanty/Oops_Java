import java.io.*;
import java.lang.*;
import java.util.*;
class que13
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your first no.:");
		int a = Integer.parseInt(no.readLine());
		System.out.print("Enter your second no.:");
		int b = Integer.parseInt(no.readLine());
		if(a>b)
		{
			System.out.println("The largest number is"+a);
		}
		else
		{
			System.out.println("The largest number is"+b);
		}
	}
}