import java.util.*;

class Complex {
    int real, imag;

    Complex() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of the complex number");
        real = sc.nextInt();
        System.out.println("Enter the imaginary part of the complex number");
        imag = sc.nextInt();
    }

    void show() {
        System.out.println(real + "+" + imag + "i");
    }

    static Complex Add(Complex n1, Complex n2) {
        Complex res = new Complex();
        res.real = n1.real + n2.real;
        res.imag = n1.imag + n2.imag;
        return res; 
    }
}

class que4 {
    public static void main(String arg[]) {
        Complex A = new Complex();
        Complex B = new Complex();
        System.out.println("first number:");
        A.show();
        System.out.println("second number:");
        B.show();
        Complex res = Complex.Add(A, B); 
        System.out.println("Sum of two complex numbers is " + res.real + "+" + res.imag + "i");
    }
}
