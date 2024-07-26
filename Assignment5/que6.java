/*Create a class Person that has data member name. Use constructor to initialize name and display() to display name. Create a derived class Employee from Person class having private members empid. Using constructor initialize empid and have method display() to display empid. Create another derived class HourlyEmployee from Employee with private members hourlyRate and hoursWorked. Use constructor to initialize input and methods getGrossPay() that computes and returns the gross pay of the employee and display() to display the hourlyRate, hoursWorked and gross pay. Create a driver class to test the functionalities of the above classes and display output in the following format
Name : John Smith
EmpID : 7569
Hourly Rate : 100
Hours worked : 2000
Gross pay : 200000 */
import java.util.*;
class Person
{
	String name;
	Person(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("Name :" +name);
	}
}
class Employee extends Person
{
	private int empid;
	Employee(String name,int empid)
	{
		super(name);
		this.empid=empid;
	}
	void display()
	{
		super.display();
		System.out.println("Emp ID :" +empid);
	}
}
class HourlyEmployee extends Employee
{
	private double hourlyRate;
	private int	hoursWorked;
	HourlyEmployee(String name,int empid,double hourlyRate,int hoursWorked)
	{
		super(name,empid);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	double getGrossPay()
	{
		double gpay;
		gpay=hourlyRate*hoursWorked;
		return gpay;
	}
	void display()
	{
		super.display();
		System.out.println("Hourly Rate :" +hourlyRate);
		System.out.println("Hours worked :" +hoursWorked);
		System.out.println("Gross pay :" +getGrossPay());
	}
}
class que6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of the person");
		String name=sc.next();
		int empid = sc.nextInt();
		double hourlyRate=sc.nextDouble();
		int	hoursWorked=sc.nextInt();
		HourlyEmployee a=new HourlyEmployee(name,empid,hourlyRate,hoursWorked);
		a.display();
	}
}

		
	

