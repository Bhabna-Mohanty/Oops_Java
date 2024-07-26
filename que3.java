//program to display additional result
import java.io.*;
import java.lang.*;
class que3
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your first no.:");
		float a = Float.parseFloat(no.readLine());
		System.out.print("Enter your second no.:");
		float b = Float.parseFloat(no.readLine());
		float res = a+b;
		System.out.println("The additional resultant of the two nos. is "+res);
	}
}
		