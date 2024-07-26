import java.util.*;

class Stack{
	int max;
	int arr[];
	int top;
	Stack(int n)
	{
		max=n;
		arr=new int[max];
		top=-1;
	}
	void push(int val)
	{
		if(top==max-1)
			System.out.println("Stack overflow");
		else
		{
			top++;
			arr[top]=val;
		}
	}
	void pop()
	{
		if(top==-1)
			System.out.println("Stack underflow");
		else
			top--;
	}
	void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
}
class que8
{
	public static void main(String args[])
	{
		Stack stack=new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.display();
		stack.push(3);
		stack.push(4);
		stack.display();
		stack.pop();
		stack.display();
	}
}