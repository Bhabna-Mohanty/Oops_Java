/*Write a java program that will create one child thread. The child thread has to display all odd numbers between m and n, and the main thread will display all the even numbers between m and n.*/
import java.util.Scanner;
class childthread extends Thread
{
	int m,n;
	childthread(int m,int n)
	{
		this.m=m;
		this.n=n;
	}
	public void run()
	{
		System.out.println("The odd numbers are:");
		if(m>n)
		{
			for(int i=n;i<m+1;i++)
			{
				if(i%2==1)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			for(int i=m;i<n+1;i++)
			{
				if(i%2==1)
				{
					System.out.println(i);
				}
			}
		}
	}
}
class que3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers");
		int m=sc.nextInt();
		int n=sc.nextInt();
			System.out.println("The even numbers are :");
			if(m>n)
			{
				for(int i=n;i<m+1;i++)
				{
					if(i%2==0)
					{
						System.out.println(i);
					}
				}
			}
			else
			{
				for(int i=m;i<n+1;i++)
				{
					if(i%2==0)
					{
						System.out.println(i);
					}
				}
			}
		
		childthread t=new childthread(m,n);
		t.start();
	}
}
		
			