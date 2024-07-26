import java.lang.*;
class Student
{
	String name;
	int roll_no;
}
class que2
{
	public static void main(String args[])
	{
		Student a=new Student();
		a.name="John";
		a.roll_no=20;
		System.out.println("The name of the student is"  +a.name+  "and roll no. is " +a.roll_no);
	}
}