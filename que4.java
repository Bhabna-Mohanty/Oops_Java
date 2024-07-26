import java.io.*;
import java.lang.*;
class que4
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your first no.:");
		int a = Integer.parseInt(no.readLine());
		System.out.print("Enter your second no.:");
		int b = Integer.parseInt(no.readLine());
		System.out.println("The original values are:"+a+"and"+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("The new values are:"+a+"and"+b);
	}
}