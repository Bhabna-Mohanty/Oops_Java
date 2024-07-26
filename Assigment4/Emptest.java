import java.util.*;
import java.lang.*;
class Employee{
	private String empName; 
	private String empNo;
	private int dependentCnt;
	Employee(String name, String eno, int depcnt){
		empName=name;
		empNo=eno;
		dependentCnt=depcnt;
	}
	void showEmpDetails(){
		System.out.println("The name of the employee is" +empName);
		System.out.println(	"The employee no. is" +empNo);
	}
	int depCount(){
		return dependentCnt;
	}
		
}
class Emptest
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of employees");
		int length=sc.nextInt();
		Employee emp[]=new Employee[length];
		for(i=0;i<length;i++)
		{
			System.out.print("Enter name,employee no,dependent value:- ");
			emp[i]=new Employee(sc.next(),sc.next(),sc.nextInt());
		}
		System.out.print("Name\t\tEmpNo\n");
		for(i=0;i<length;i++)
		{
			if(emp[i].depCount()>=2)
			{
				emp[i].showEmpDetails();
			}
		}
	}
}

