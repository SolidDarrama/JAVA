//Jose Guadarrama
//11.14.2013
//Chapter 12 Exercise 9 - Using index Out of Bounds Exception

public class C12e9 
{
//--------------------Main Method---------------------------
	   public static void main (String[] args)
	{
//set up a try/catch
//Within the try
//Call the tooLarge method, passing it nothing
//Within the Catch
//Display blank line
//Display the entire "out of the array" message
//Display the entire "modify code" message
//After try/catch
//Display blank line
//Display End of Program message
       try
        {
    	tooLarge();
        }
       catch (ArrayIndexOutOfBoundsException e)
       {
    	System.out.println(" ");
    	System.out.print("Array slot ");
    	System.out.print(e.getMessage());
    	System.out.println(" is out of the array boundry limits.");
    	System.out.print("Modify code assuring array slot ");
    	System.out.print(e.getMessage());
    	System.out.println(" is not referenced.");
       }
   	   System.out.println(" ");
   	   System.out.println("End of Program.");
	}
//-------------------tooLarge------------------------------
	  public static void tooLarge()
	  {
//Declare int array named myArray, it has 3 slots
//Declare int variable named count, that = 5
//Set up a for (int index=0; index<=myArray.length; index++)
//Within the for loop
//Make myArray[index]=count
//add 5 to the count variable
//Display the entire "array slot contains" message
	   int [] myArray = new int [3];
	   int count = 5;
	   for (int index=0; index<=myArray.length; index++)
	     {
           myArray[index]=count;
           count=count+5;
           System.out.println("Array slots " + index + " contains a " + myArray[index] + ".");
	     }
	  }
}
