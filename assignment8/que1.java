class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Inside Thread : "+this.getName());
		System.out.println("Inside Thread : "+this.getId());
	}
}
class que1
{
	public static void main(String args[])
	{
		MyThread t1=new MyThread();         
		System.out.println("Name of t1:"+t1.getName());
		System.out.println("ID of Thread t1 is :"+t1.getId());			  
		t1.setName("FirstThread");
		t1.start();      		
		System.out.println("After setting the name of t1:"+t1.getName()); 
		System.out.println("MyThread t1 is Alive :"+t1.isAlive());
		try { 
			System.out.println("Waiting for threads to finish."); 
			t1.join();  
		} 
		catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		} 
		System.out.println("MyThread t1 is Alive :"+t1.isAlive());
		System.out.println("Main thread exiting."); 
	}
} 