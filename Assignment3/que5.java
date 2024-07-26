import java.util.*;
class Employee
{
	String name,address;
	int year;
	double salary;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Employee");
		name=sc.next();
		System.out.println("Enter the year of joining of the Employee");
		year=sc.nextInt();
		System.out.println("Enter the salary of the Employee");
		salary=sc.nextDouble();
		System.out.println("Enter the address of the Employee");
		address=sc.next();
	}
	void output()
	{
		System.out.println("name : "+name+ "Year of joining : "+year+ "salary : "+salary+ "Address :" +address);
	}
}
class que5
{
	public static void main(String args[])
	{
		Employee[] E=new Employee[3];
		int i;
		for(i=0;i<3;i++)
		{
			E[i]=new Employee();
		}
		for(i=0;i<3;i++)
		{
			E[i].input();
			E[i].output();
		}
		
	}
}
		
	