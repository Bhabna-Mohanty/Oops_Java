//program to display name,branch,roll no,and college name
import java.io.*;
import java.lang.*;
class que1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your Name: ");
		String name = ob.readLine();
		System.out.print("Enter your Branch: ");
		String branch = ob.readLine();
		System.out.print("Enter your Roll no.: ");
		int roll = Integer.parseInt(ob.readLine());
		System.out.print("Enter your College Name: ");
		String clg = ob.readLine();
		System.out.println("Name: "+name);
		System.out.println("Branch: "+branch);
		System.out.println("Roll No.: "+roll);
		System.out.println("College: "+clg);
	}
}