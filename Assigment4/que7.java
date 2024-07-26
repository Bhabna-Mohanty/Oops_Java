import java.util.*;

class gcd_lcm
{
	int a;
	int b;
	gcd_lcm(int a,int b){
		this.a=a;
		this.b=b;
	}
	int gcd(){
		int z;
		if(a<b)
			z=a;
		else
			z=b;
		
		for(int i=1;i<=z;i++)
		{
			if(a%i==0)
			{
				if(b%i==0)
				{
					return i;
				}
			}
		}
		return 1;
	}
	int lcm(){
		return (a*b)/gcd();
	}
}
	
		
class que7
{
	public static void main(String args[]){
		if(args.length!=2){
			System.out.println("2 numbers are required");
		}
		gcd_lcm n=new gcd_lcm(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		System.out.println("GCD = "+n.gcd());
		System.out.println("LCM = "+n.lcm());
	}
}
		
		
		
		
