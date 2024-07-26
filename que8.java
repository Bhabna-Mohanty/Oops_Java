import java.io.*;
import java.lang.*;
import java.util.*;
class que8
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the marks in Java");
		float j = Float.parseFloat(no.readLine());
		System.out.print("Enter the marks in Maths");
		float m = Float.parseFloat(no.readLine());
		System.out.print("Enter the marks in BME");
		float b = Float.parseFloat(no.readLine());
		float avg;
		avg=(j+m+b)/3;
		System.out.println("The average mark is"+avg);
	}
}
		