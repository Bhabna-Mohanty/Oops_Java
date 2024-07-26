import java.io.*;
import java.lang.*;
import java.util.*;
class que11
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader no = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(" Enter the Time in seconds: ");
		int time = Integer.parseInt(no.readLine());
		int hrs = time / 3600;
        int mins = (time % 3600) / 60;
        int secs = (time % 3600) % 60;
        System.out.println(hrs+ " Hours: " +mins+ "minutes:" +secs+ "seconds");
	}
}