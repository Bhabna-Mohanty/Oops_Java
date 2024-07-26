import java.util.*;
class que4
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in Maths");
		float m=sc.nextFloat();
		System.out.println("Enter the marks in Java");
		float j=sc.nextFloat();
		System.out.println("Enter the marks in English");
		float e=sc.nextFloat();
		System.out.println("Enter the marks in BME");
		float b=sc.nextFloat();
		float avg;
		avg=(j+m+e+b)/4;
		if(avg>=90){
			System.out.println("Grade O");
		}
		else if(avg>=80 && avg<90){
			System.out.println("Grade E");
		}
		else if(avg>=70 && avg<80){
			System.out.println("Grade A");
		}
		else if(avg>=60 && avg<70){
			System.out.println("Grade B");
		}
		else if(avg>=50 && avg<60){
			System.out.println("Grade c");
		}
		else{
			System.out.println("Grade F");
		}
	}
}
		
		