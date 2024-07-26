import java.util.*;
class Box
{
	int width;
	int height;
	int depth;
	Box(int w,int h,int d){
		width=w;
		height=h;
		depth=d;
	}
	double volume(){
		return width*height*depth;
	}
}
class que1
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the width of the box");
		int x=sc.nextInt();
		System.out.println("Enter the height of the box");
	    int y=sc.nextInt();
		System.out.println("Enter the depth of the box");
		int z=sc.nextInt();
		Box A = new Box(x,y,z);
		double v;
		v=A.volume();
		System.out.println("The volume of the box is "+v);
	}
}
		