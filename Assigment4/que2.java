/*Design a class ‘ComplexNum’ to manipulate Complex numbers having data members as real and img. The class should have a parameterized constructor 
to initialize its data members. It should also have methods displayCompNumber() to display the complex number (in the format 5+3i for example),
addCompNumber() to add two Complex numbers. Test these methods by creating main method in another class.*/
import java.util.*;
import java.lang.*;
class Complexnum{
	int real,imag;
	Complexnum()
	{
		real=0;
		imag=0;
	}
	Complexnum(int r,int i)
	{
		real=r;
		imag=i;
		
	}
	void displayCompNumber(){
		System.out.println(real + "+" + imag + "i");
	}
	void addCompNumber(Complexnum a,Complexnum b){
        int real1 = a.real + b.real;
        int imag1 = a.imag + b.imag;
        System.out.println("The sum is "+real1+"+"+imag1+"i"); 
	}
}
class que2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
		Complexnum A= new Complexnum(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the second number");
		Complexnum B= new Complexnum(sc.nextInt(),sc.nextInt());
		Complexnum C= new Complexnum();
		A.displayCompNumber();
		B.displayCompNumber();
		C.addCompNumber(A,B);
		
	}
}
		
		
		
 