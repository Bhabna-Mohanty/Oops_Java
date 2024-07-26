/*Design a class ‘Time’ having data members as hour, minute and second. The class should have a parameterized constructor to initialize its
 data members. It should also have methods displayTime() to display the time in HH:MM:SS format and addTime() to add two times. Test these methods
 by creating a main method in another class.*/
 import java.util.*;
 import java.lang.*;
 class Time{
	 int hr;
	 int min;
	 int sec;
	 Time(){
		 hr=0;
		 min=0;
		 sec=0;
	 }
	 
	 Time(int hr,int min,int sec){
		 this.hr=hr;
		 this.min=min;
		 this.sec=sec;
	 }
	 void displayTime(){
		 System.out.println(hr+"HH:"+min+"MM:"+sec+"SS");
	 }
	 void addTime(Time a,Time b){
		 int hr1=a.hr+b.hr;
		 int min1=a.min+b.min;
		 int sec1=a.sec+b.sec;
		 System.out.println("The sum is "+hr1+"HH:"+min1+"MM:"+sec1+"SS");
	 }
 }
 class que4{
	 public static void main(String args[])
	 {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first time");
		Time A= new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Enter the second time");
		Time B= new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
		A.displayTime();
		B.displayTime();
		Time C=new Time();
		C.addTime(A,B);
	 }
 }
		