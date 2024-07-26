import java.util.*;

class que8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int i;
        boolean isPrime = true; 

        for (i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                isPrime = false; 
                break;
            }
        }

        if (isPrime) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }
}
