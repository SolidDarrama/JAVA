import java.util.Scanner;

//Jose Guadarrama
//10.24.2013
//Chapters 8 Test - Calculate Square Root and Round a Value

public class C8t1 
{
//---------------------main method-----------------------------
//declare int variable userInput
//create a Scanner kb
//Prompt user with a message
//populate userInput with value the user entered by using kb scanner
//call examineInput (passing it the userInput)
//Display blank line
//Display End of Program

	public static void main(String[] args) 
	{
     int userInput;
	 Scanner kb = new Scanner (System.in);
     System.out.println("Enter an Integer Value");
   	 userInput = kb.nextInt();
   	 examineInput(userInput);
   	 System.out.println("");
   	 System.out.println("End of Program");
	}
//------------------examine Input method------------------------
//declare double variable resultOne
//declare long variable resultTwo
//make if statement (userInput>0)
//make resultOne = Math.sqrt(userInput)
//make resultTwo = Math.round(resultOne)
//Display message a, b ,c from Consle window
//in the else do.....
//display message from Console window
//display another message from Console window
	
	public static void examineInput(int userInput)
	{
	 double resultOne;
	 long resultTwo;
	   if (userInput > 0)
	   {
		resultOne=Math.sqrt(userInput);
		resultTwo=Math.round(resultOne);
		System.out.println("a. The " + userInput + " you entered is a positive numer");
		System.out.println("b. It's square root is " + resultOne);
		System.out.println("c. " + resultOne + " rounded is " +  (int) resultOne);
	   }
	     else 
	    	 if (userInput == 0)
	          {
		      System.out.println("neither positive or negative or negative number");
	          }
	    	     else
	    	     {
	   		      System.out.println("negative number");
	    	     }
	}
}
