import java.io.*;
import java.lang.*;
import java.util.*;
class que6
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the radius of the circle:");
		int r = Integer.parseInt(no.readLine());
		double area;
		area=Math.PI*r*r;
		System.out.print("The area of the circle is"+area);
	}
}