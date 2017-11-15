import java.util.Scanner;

//Jose Guadarrama
//11.14.2013
//Chapter 12 HW Exercise 2 - Using Input Mismatch Exception

class C12e2
{
//---------------------Main Method--------------------------
   public static void main (String[] args)
   {
//Create scanner
//Declare a double variable named userInput and squared
//Prompt the user
//Set up try/catch block
//Within the try 
//Populate the userInput variable using the kb scanner and the .nextDouble method
//Within the catch (Exception e)
//Display The value message
//Display Causing the Input message
//create the e.getMessage()
//After Try/Catch do the following
//Set up a if (userInput>0)
//Within the if
//Make squared = calcSquared() which is passing the userInput
//Display Message
//Set up another if (userInput<0)
//Within the if
//Display Message
//After the if
//Display End of Program message
    Scanner kb = new Scanner (System.in);
    double userInput=0, squared=0;
    System.out.println("Enter a Positive Number:");
      try
      {
       userInput = kb.nextDouble();	
      }
      catch (Exception e)
      {
    	System.out.println("The value you entered is not a number.");
    	System.out.print("Causing the Input Mismatch Exception message ---> ");
    	System.out.print(e.getMessage());
    	System.out.println(".");
      }
      if (userInput>0)
      {
        squared = calcSquared(userInput);
        System.out.println(userInput + " squared is " + squared + ".");
      }
      if (userInput<0)
      {
        System.out.println("The value you entered is a negative number.");
      }  
      System.out.println("");
      System.out.println("End of Program.");
   }
//---------------------calcSquared-------------------------------
   public static double calcSquared (double userInput)
   {
//Declare double squared = 0
//Make squared = userInput*userInput
//Return the squared variable
	double squared = 0;
	squared = (userInput*userInput);
	return squared;
   }
}
