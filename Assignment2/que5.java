import java.util.*;

class que5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficient of xsquare");
        int a = sc.nextInt();
        System.out.println("Enter the coefficient of x");
        int b = sc.nextInt();
        System.out.println("Enter the value of constant");
        int c = sc.nextInt();
        double r1, r2 ;
		double d;
        d = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        if (d == 0) {
            System.out.println("The roots are equal");
            r1 = r2 = -b / (2 * a); 
            System.out.println("The roots are " + r1 + " and " + r2 + "."); 
        } else if (d > 0) {
            System.out.println("The roots are real");
            r1 = (-b + Math.sqrt(d)) / (2 * a); 
            r2 = (-b - Math.sqrt(d)) / (2 * a); 
            System.out.println("The roots are " + r1 + " and " + r2 + "."); 
        } else {
            System.out.println("The roots are distinct and imaginary");
        }
    }
}
