import java.io.*;
import java.lang.*;
import java.util.*;
class que7
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of the rectangle");
		int l = Integer.parseInt(no.readLine());
		System.out.print("Enter the breadth of the rectangle");
		int b = Integer.parseInt(no.readLine());
		int area;
		area=l*b;
		System.out.println("The area of any rectangle is"+area);
	}
}

		