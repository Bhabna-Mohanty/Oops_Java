import java.io.*;
import java.lang.*;
import java.util.*;
class que12
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(" Enter the distance in meters ");
		double m = Double.parseDouble(no.readLine());
		double km;
		km=m/1000;
		System.out.println("The distance is"+km+"kilometers");
	}
}