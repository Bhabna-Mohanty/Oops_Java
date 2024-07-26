import java.lang.*;
import java.io.*;
class que21{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,n;
		System.out.println("Enter the total number of elements");
		n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("The required numbers are");
		for(i=0;i<n;i++){
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
		