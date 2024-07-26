import java.util.*;
class Average
{
	int i,j,k;
	void initialize(int a,int b,int c)
	{
		i=a;
		j=b;
		k=c;
	}
	void calc()
	{
		double avg;
		avg=(i+j+k)/3;
		System.out.println("The average of two numbers are" +avg);
	}
}
class Avgdemo
{
	public static void main(String args[])
	{
		Average a=new Average();
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		a.initialize(sc.nextInt(),sc.nextInt(),sc.nextInt());
		a.calc();
	}
}
		