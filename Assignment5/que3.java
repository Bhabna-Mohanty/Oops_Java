 import java.util.*;
 class Point2D
 {
	 int x,y;
	 void getCoord(int x,int y)
	 {
		this.x=x;
		this.y=y;
	 }
	 void display()
	 {
		System.out.println("("+x+","+y+")");
	 }
 }
 class Point3D extends Point2D
 {
	int z;
	Point3D(int x,int y,int z)
	{
		super.getCoord(x,y);
		this.z=z;
	}
	void show()
	{
		System.out.println("("+x+","+y+","+z+")");
	}
 }
 class que3
 {
	 public static void main(String args[])
	 {
		 Scanner sc= new Scanner(System.in);
		 Point2D A1=new Point2D();
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 Point3D A2 = new Point3D(a,b,c);
		 A1=A2;
		 A2.display();
		 A2.show();
	 }
 }
	