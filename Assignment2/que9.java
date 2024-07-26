import java.util.*;
class que9
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int b,sum=0,temp;
		temp=a;    
		while(a>0){    
		b=a%10;  
		sum=(sum*10)+b;    
		a=a/10; 
		}		
		if(temp==sum){
			System.out.println("the number is pallindrome");
		}
		else{
			System.out.println("the number is not pallindrome");
		}
	}
}