import java.lang.*;
import java.io.*;
class que18{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of the array");
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		int i,pos;
		pos=-1;
		System.out.println("Enter the elements");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the element to be searched");
		int x=Integer.parseInt(br.readLine());
		for(i=0;i<arr.length;i++)
		{
			if(x==arr[i])
			{
				pos=i;
				break;
			}
		}
		if(pos>=0)
		{
			System.out.println("Element found in the index"+(pos+1));
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}
	