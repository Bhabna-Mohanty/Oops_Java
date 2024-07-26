import java.lang.*;
class Rectangle
{
	int l,b;
	double area(int x,int y)
	{
		l=x;
		b=y;
		return x*y;
	}
}
class que3
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		double x=r1.area(4,5);
		System.out.println("The area is" +x);
		Rectangle r2=new Rectangle();
		double y= r2.area(5,8);
		System.out.println("The area is" +y);
	}
}
		
