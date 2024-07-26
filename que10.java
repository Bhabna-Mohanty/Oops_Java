import java.io.*;
import java.lang.*;
import java.util.*;
class que10
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the temperature in farenheit");
		float f = Float.parseFloat(no.readLine());
		float c;
		c=((f-32)*5)/9;
		System.out.println("The temperature in celcius scale is"+c);
	}
}
		