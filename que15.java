import java.io.*;
import java.lang.*;
import java.util.*;
class que15
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the four-digit number:");
		int num = Integer.parseInt(no.readLine());
		int digit,sum=0;
		while(num > 0) 
		{
			digit = num % 10; 
			sum = sum + digit; 
			num = num / 10;
		}			
		System.out.print("Sum of the digits of four-digit number is"+sum);
	}
}
