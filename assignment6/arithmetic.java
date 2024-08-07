package btech.arithmetic;
import java.util.*;
public class MyMath {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; 
        }
    }
    public static int mod(int num1, int num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Error: Cannot calculate modulus with divisor zero.");
            return Integer.MIN_VALUE; 
        }
    }
}

