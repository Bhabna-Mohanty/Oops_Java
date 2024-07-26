/*Create a class Point2D with the data member x and y coordinate and methods getCoord() that sets the coordinate value and display() to show the coordinates. 
Create a subclass called Point3D which is derived from the superclass Point2D with data members z coordinate and has methods getInput() to initialize the input and
 show() method to display the coordinates. Test the methods of both the classes by creating objects in the main method of driver class.*/
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
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coodinates");
		super.getCoord()=(sc.nextInt(),sc.nextInt());
		this.z=sc.nextInt();
	}
	void show()
	{
		System.out.println("("+x+","+y+","+z+")");
	}
 }
 class que2
 {
	 public static void main(String args[])
	 {
		 Point2D A1;
		 Point3D A2=new Point3D();
		 A1=A2;
		 A2.getInput();
		 A2.display();
		 A2.show();
	 }
 }
	