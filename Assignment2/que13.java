import java.lang.*;
import java.io.*;
class que13{
	static void max(int arr[]){
		int i,max;
		max=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The largest number is"+max);
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,n;
		System.out.println("Enter the length of the array");
		n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		System.out.println("Enter the elments");
		for(i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		max(arr);
	}
}

		