import java.util.Scanner;

class Area {
    double length;
    double breadth;

    void setDim() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        length = sc.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }

    double getArea() {
        return length * breadth;
    }
}

class que6 {
    public static void main(String[] args) {
        Area rectangle = new Area();
        rectangle.setDim();
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
