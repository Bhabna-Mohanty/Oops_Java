import java.util.*;
class Employee{
	int empId,mngId,deptNo,sal;
	String empName,job;
	Employee(int empId,String empName,int mngId,int deptNo,int sal,String job){
		this.empId=empId;
		this.empName=empName;
		this.mngId=mngId;
		this.deptNo=deptNo;
		this.sal=sal;
		this.job=job;
	}
	void display(){
		System.out.print("Employee Id-  "+empId+"\n"+"Employee Name-  "+empName+"\n"+"Manager Id-  "+mngId+"\n"+"Department No-  "+deptNo+"\n"+"Salary-  "+sal+"\n"+"Job-  "+job+"\n");
	}
}
class que8
{
	public static void main(String args[]){
		if(args.length!=6){
			System.out.println("Error!Give inputs");
		}
		Employee emp=new Employee(Integer.parseInt(args[0]),args[1],Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]),args[5]);
		emp.display();
	}
}
