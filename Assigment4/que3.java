/*Design a class ‘Point’ with data members as xCo and yCo. The class should have a parameterized constructor to initialize its data members.
 Define a method distanceBetPoints() which returns the distance between two points.*/
 import java.util.*;
 import java.lang.*;
 class Point{
	 int xco;
	int yco;
	Point(int a,int b)
	{
		xco=a;
		yco=b;
	}
	static double distanceBetPoints(Point a,Point b)
	{
		return Math.sqrt(Math.pow((a.xco-b.xco),2)-Math.pow((a.yco-b.yco),2));
	}
}
class que3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter point 1 coordinates: ");
		Point p1=new Point(sc.nextInt(),sc.nextInt());
		System.out.println("Enter point 2 coordinates: ");
		Point p2=new Point(sc.nextInt(),sc.nextInt());
		double result=Point.distanceBetPoints(p1,p2);
		System.out.println("Distance="+result);
	}
}