
import java.util.*;
abstract class Figure
{
	double dim1;
	double dim2;
	Figure(double dim1,double dim2)
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}
	abstract double area();
}
class Rectangle extends Figure
{
	Rectangle(double dim1,double dim2)
	{
		super(dim1,dim2);
	}
	public double area()
	{
		System.out.println("Area of Rectangle" +dim1*dim2);
		return 0;
	}
}
class Triangle extends Figure
{
	Triangle(double dim1,double dim2)
	{
		super(dim1,dim2);
	}
	public double area()
	{
		System.out.println("Area of Triangle" + (dim1*dim2)/2);
		return 0;
	}
}
class que11
{
	public static void main(String args[])
	{
		Figure f;
		Rectangle R = new Rectangle(4,8);
		Triangle T=new  Triangle(6,8);
		f=R;
		f.area();
		f=T;
		f.area();
	}
}

