import java.io.*;
import java.lang.*;
import java.util.*;
class que9
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the principal value");
		float p = Float.parseFloat(no.readLine());
		System.out.print("Enter the rate of interest");
		float r = Float.parseFloat(no.readLine());
		System.out.print("Enter the time period");
		int t = Integer.parseInt(no.readLine());
		float si;
		si=(p*r*t)/100;
		System.out.println("The simple interest is"+si);
	}
}