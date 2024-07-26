import java.util.*;
import java.lang.*;
class Account{
	private int accNO;
	private double balance;
	private int timePeriod;
	private static float InYears=7.5f;
	public Account(int accNO,double balance,int timePeriod)
	{
		this.accNO=accNO;
		this.balance=balance;
		this.timePeriod=timePeriod;
	}
	float calculateInterest()
	{
		return (float)(balance*InYears*timePeriod)/100;
	}
	static void changeIntRate(float newR)
	{
		InYears=newR;
	}
	void showAccDetails()
	{
		System.out.println(accNO + "\t\t" + balance + "\t\t" + calculateInterest());
	}
}
class que6
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter account no,balance,time period:- ");
		Account acc=new Account(sc.nextInt(),sc.nextDouble(),sc.nextInt());
		System.out.print("Account no\tBalance\t\tInterest\n");
		acc.showAccDetails();
		acc.changeIntRate(3.9f);
		System.out.println("After changing the rate :- ");
		acc.showAccDetails();
	}
}