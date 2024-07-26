import java.util.Scanner;

class Point2D {
    int x;
    int y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getCoord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("2D Coordinates: (" + x + ", " + y + ")");
    }
}

class Circle extends Point2D {
    double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    double height;

    public Cylinder() {
        super();
        this.height = 0;
    }

    public Cylinder(int x, int y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }
}

public class que4
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter x coordinate for Circle's center: ");
        int xCircle = scanner.nextInt();
        System.out.println("Enter y coordinate for Circle's center: ");
        int yCircle = scanner.nextInt();
        System.out.println("Enter radius of the Circle: ");
        double radiusCircle = scanner.nextDouble();

        
        Circle circle = new Circle(xCircle, yCircle, radiusCircle);

       
        System.out.println("Enter x coordinate for Cylinder's base center: ");
        int xCylinder = scanner.nextInt();
        System.out.println("Enter y coordinate for Cylinder's base center: ");
        int yCylinder = scanner.nextInt();
        System.out.println("Enter radius of the Cylinder's base: ");
        double radiusCylinder = scanner.nextDouble();
        System.out.println("Enter height of the Cylinder: ");
        double heightCylinder = scanner.nextDouble();

        
        Cylinder cylinder = new Cylinder(xCylinder, yCylinder, radiusCylinder, heightCylinder);

        
        System.out.println("\nArea of Circle: " + circle.area());

        
        System.out.println("Volume of Cylinder: " + cylinder.volume());

        scanner.close();
    }
}