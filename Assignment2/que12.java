import java.lang.*;
import java.io.*;
class que12{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,n,s=0;
		float m;
		System.out.println("Enter the total number of elements");
		n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++){
			s=s+a[i];
		}
		m=s/n;
		System.out.println("The mean of the elements are"+m);
	}
}

		
		