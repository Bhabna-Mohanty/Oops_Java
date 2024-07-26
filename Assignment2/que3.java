import java.util.*;
class que3
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the income");
		float income=sc.nextFloat();
		if(income<=150000){
			System.out.println("No tax is applied");
		}
		else if(income>=150001 && income<=300000){
			float tax=(income*10)/100;
			System.out.printf("The tax applied is %f\n",tax);
		}
		else if(income>=300001 && income<=500000){
			float tax=(income*20)/100;
			System.out.printf("The tax applied is %f\n",tax);
		}
		else{
			float tax=(income*30)/100;
			System.out.printf("The tax applied is %f\n",tax);
		}
	}
}