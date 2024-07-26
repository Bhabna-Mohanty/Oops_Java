import java.util.*;
class que19 {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length if the array");
		int n=sc.nextInt();
		int a[ ]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<(a.length-i-1);j++)
			{
				if(a[j]>a[j+1])
				{
					int t;
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("The sorted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

