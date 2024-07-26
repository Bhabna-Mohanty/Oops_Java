/*Write a java program, that will create one thread. The main thread will read a number and check the number is prime or composite and the same time the new thread will check the number palindrome or not.*/
import java.util.Scanner;
class NewThread extends Thread
{
	int n;
	NewThread(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("Thread is running");
		int x=n;
		int sum =0;
		while(n>0){
			int d=n%10;
			sum=(sum*10)+d;
			n=n/10;
		}
		if(sum==x)
		{
			System.out.println("The number is pallindrome");
		}
		else
		{
			System.out.println("The number is not pallindrome");
		}
	}
}
class que2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		NewThread t1=new NewThread(a);
		t1.start();
		try
		{
			 int i,m=0,flag=0;          
			  m=a/2;      
			  if(a<=1){  
			   System.out.println(a+" is not prime number");      
			  }
			  else
			  {  
				for(i=2;i<=m;i++)
				{      
					if(a%i==0)
					{      
					 System.out.println(a+" is not prime number");      
					 flag=1;      
					 break;      
					}      
				}      
				if(flag==0)  
				{ 
					System.out.println(a+" is prime number"); 
				}
			  }
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
		System.out.println("Exiting child Thread");
	}
}	
		
		
