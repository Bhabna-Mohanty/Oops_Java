import java.util.Scanner;
class Employee{
	String empname;
	double empno;
	double basicsal;
	double da;
	double hra;
	double grossSal;
	Employee(String a,double b,double c){
		empname=a;
		empno=b;
		basicsal=c;
	}
	void calGrossSal(){
		da=basicsal*(20.0/100.0);
		hra=basicsal*(10.0/100.0);
		grossSal=basicsal+da+hra;
	}
	void showEmpDetails(){
		System.out.print(empname+"\t\t"+empno+"\t\t"+basicsal+"\t\t"+da+"\t\t"+hra+"\t\t"+grossSal+"\n");
	}
}
class que9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		Employee emp[]=new Employee[2];
		for(i=0;i<2;i++)
		{
			System.out.print("Enter emp"+(i+1)+" employee no,basicsalary\n");
			emp[i]=new Employee(sc.next(),sc.nextInt(),sc.nextInt());
		}
		System.out.print("Name\t\tempno\t\tbasicSalary\tda\t\thra\t\tgross salary \n");
		for(i=0;i<2;i++)
		{
			emp[i].calGrossSal();
			emp[i].showEmpDetails();
		}
	}
}