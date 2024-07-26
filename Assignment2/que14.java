import java.lang.*;
import java.io.*;
class que14{
	static void maxmin(int arr[]){
		int i,max,min,r;
		max=arr[0];
		min=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=i;
			}
			else if(arr[i]>max){
				max=i;
			}
		}
		r=arr[min];
		arr[min]=arr[max];
		arr[max]=r;
		System.out.println("The resultant array");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,n;
		System.out.println("Enter the total no. of elements");
		n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		maxmin(arr);
	}
}

		