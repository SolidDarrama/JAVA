import java.util.Scanner;

//Jose Guadarrama
//10.24.2013
//Chapters 6-7 Test Determine Square Root and Cube Values

public class C7t1
{
//--------------------Main Method-------------------------------------
//declare int variables numEntered, squareRoot, and cubed
//create a kb scanner
//prompt the user with a message
//make variable numEntered = to kb Scanner
//Set a while loop (numEntered !=0)
//use an if statement
//Display "in 13.." and "values not calc..." from the Console window
//Prompt the user with a message
//make variable numEntered = to kb Scanner
//use variable squareRoot call calcSquare, while passing numEntered Variable
//make cubed variable = to the result of the calling of the calcCube(while passing numEntered)
//Display square is, and another line cubed is
//prompt the user with a message
//make variable numEntered = to kb Scanner
	public static void main(String[] args) 
	{
     int numEntered, squareRoot, cubed;
	 Scanner kb = new Scanner (System.in);
     System.out.println("Enter an Integer Number -or- Enter a 0 to Terminate Program");
   	 numEntered = kb.nextInt();
   	 
   	   while (numEntered !=0)
   	   {
   		 if (numEntered >= 13 && numEntered <= 19)
   		   {
   		   System.out.println("Integer Number Entered is in the 13 to 19 Range.");
   		   System.out.println("Square Root and Cube Values not Calculated for Integer " + numEntered);
   		   System.out.println("");
   		   System.out.println("Enter an Integer Number -or- Enter a 0 to Terminate Program");
   	   	   numEntered = kb.nextInt();
   		   }
   		    else
   		    {
   		    squareRoot=calcSquare(numEntered);
   		    cubed=calcCube(numEntered);
   		    System.out.println(numEntered + " square is " + squareRoot);
   		    System.out.println(numEntered + " cubed is " + cubed);
    		System.out.println("");
   	        System.out.println("Enter an Integer Number -or- Enter a 0 to Terminate Program");
    	    numEntered = kb.nextInt();
   		    } 
   	   }
		    System.out.println("Program Terminated - User entered a 0");
	}
//-------------------calcSquare method-------------------------------------------
//declare int variable numSquared
//numSquared variable = calculated result of squaring
//return
	public static int calcSquare(int numSquared)
	{
	numSquared=(numSquared*numSquared);
	return numSquared;
	}
//-------------------calcCube method---------------------------------------------
//declare int variable numCubed
//numCubed variable = calculated result of cubing
//return
	public static int calcCube(int numCubed)
	{
	 numCubed=(numCubed*numCubed*numCubed);
	 return numCubed;
	}
}
