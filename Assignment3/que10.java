import java.util.Scanner;
class Item{
	String name;
	double price;
	int quantity;
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		price=sc.nextDouble();
		quantity=sc.nextInt();
	}
	String getName()
	{
		return name;
	}
	double getPrice()
	{
		return price;
	}
	int getQuantity()
	{
		return quantity;
	}
	double getValue()
	{
		return quantity*price;
	}
}
class que10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Item a[]=new Item[3];
		int i;
		for(i=0;i<3;i++)
		{
			a[i]=new Item();
		}
		for(i=0;i<3;i++)
		{
			System.out.print("Enter item"+(i+1)+"\n");
			a[i].getInput();
			
		}
		double totalinv=0;
		System.out.print("Name\t\tPrice\t\tQuantity\tValue\n");
		System.out.print("=========================================================\n");
		for(i=0;i<3;i++)
		{
			System.out.print(a[i].getName()+"\t\t"+"$"+a[i].getPrice()+"\t\t"+a[i].getQuantity()+"\t\t"+"$"+a[i].getValue()+"\n");
			totalinv+=a[i].getValue();
		}
		System.out.print("Total inventory is $"+totalinv);
	}
}
		
	
