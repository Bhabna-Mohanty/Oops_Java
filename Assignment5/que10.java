
import java.util.*;
class Shape 
{
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape 
{
   void draw() {
        System.out.println("Drawing Circle");
    }
	void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape 
{
    
	void draw() {
        System.out.println("Drawing Triangle");
    }

   
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape 
{
	void draw() {
        System.out.println("Drawing Square");
    }

   
    void erase() {
        System.out.println("Erasing Square");
    }
}
class que10
{
	public static void main(String args[])
	{
		Shape S;
		Circle C=new Circle();
		Triangle T=new  Triangle();
		Square Y=new Square();
		S=C;
		S.draw();
		S.erase();
		S=T;
		S.draw();
		S.erase();
		S=Y;
		S.draw();
		S.erase();
	}
}
