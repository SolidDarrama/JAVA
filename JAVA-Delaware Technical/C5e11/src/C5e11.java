//Jose Guadarrama
//09.26.2013
//Chapter 5 Lab
import java.util.Scanner;
public class C5e11
{
	public static void main(String[] args)
	{
     int userValue;
	 Scanner kb = new Scanner(System.in);
     System.out.println("Enter an integer value greater than zero:");
     userValue = kb.nextInt();
     firstStop(userValue);
	}
   //------------------------firstStop--------------------------------
	public static void firstStop(int firstStopParm)
	{
		System.out.println("This line printed from within the First Stop method");
		secondStop(firstStopParm-1);
		System.out.println("Hello again, this line printed from within the First Stop method");
	}
  //-----------------------secondStop--------------------------------
	public static void secondStop(int secondStopParm)
	{
		if (secondStopParm<0)
			return;
		System.out.println("This line printed from within the Second Stop method");
   	firstStop(secondStopParm-1);
	}
}
