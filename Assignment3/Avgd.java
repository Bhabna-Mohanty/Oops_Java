import java.util.*;
class Average
{
	int a,b,c;
	void initialize()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no.");
		int a=sc.nextInt();
		System.out.println("Enter the second no.");
		int b=sc.nextInt();
		System.out.println("Enter the third no.");
		int c=sc.nextInt();
	double avg()
	{
		double average;
		average=(a+b+c)/3;
		System.out.println("The average of two numbers are" +average);
	}
}
class Avgd
{
	public static void main(String args[])
	{
		Average a=new Average();
		a.initialize();
		a.avg();
	}
}
		
		
		