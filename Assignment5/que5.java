/*Write a program that creates a class Account that have members customer name, account number. Account has constructor to initialize its members and method
 display() to show the result. Create a child class Savings_Account that is derived from Account class. Savings_Account have members min_bal and saving_bal. Use show() to display its details. Then create another child class Account_details from Savings_Account class have members deposit, withdrawl and a method show1() to show its details. Child classes have constructors of their own. Create a driver class that creates a record of customer and display all its details.*/
 import java.util.*;
 class Account
 {
	String Cname;
	double accntno;
	Account(String Cname,double accntno)
	{
		this.Cname=Cname;
		this.accntno=accntno;
	}
	void display()
	{
		System.out.println("The Customer name is"+Cname);
		System.out.println("The Customer account number is"+accntno);
	}
 }
 class Savings_Account extends Account
 {
	 double min_bal;
	 double saving_bal;
	 Savings_Account(String Cname,double accntno,double min_bal, double saving_bal)
	 {
		 super(Cname,accntno);
		 this.min_bal=min_bal;
		 this.saving_bal=saving_bal;
	 }
	 void show()
	 {
		 super.display();
		 System.out.println("The minimun balance is"+min_bal);
		 System.out.println("The saving balace is"+saving_bal);
	 }
 }
 class Account_details extends Savings_Account
 {
	 double deposit;
	 double withdrawl;
	 Account_details(String Cname,double accntno,double min_bal, double saving_bal,double deposit,double withdrawl)
	 {
		 super(Cname,accntno,min_bal,saving_bal);
		 this.deposit=deposit;
		 this.withdrawl=withdrawl;
	 }
		 
	 void show1()
	 {
		 super.show();
		 System.out.println("The deposit amount is"+deposit);
		 System.out.println("The withdrawl amount is"+withdrawl);
	 }
 } 
 class que5
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the detail of the customer");
		 String Cname=sc.next();
		 double accntno=sc.nextDouble();
		 double min_bal=sc.nextDouble();
		 double saving_bal=sc.nextDouble();
		 double deposit=sc.nextDouble();
		 double withdrawl=sc.nextDouble();
		 Account_details A=new Account_details(Cname,accntno,min_bal,saving_bal,deposit,withdrawl);
		 A.show1();
	 }
 }
 
		 
		 
		 