import java.util.Scanner;

//Jose Guadarrama
//10.24.2013
//Chapters 9 Test - Processing a Two-Dimensional Array

public class C9t1 
{
//----------------------main method---------------------------
//declare two-dimensional array, named scoresArray, 5 rows and 3 columns
//create kb scanner
//declare int, row column and averageCounter, each = 0
//double variables sum and average, average = 0
//set up for loop (int row=0; row<5; row++)
//sum=0
//for loop (int column=0; column<3; cloumn++)
//within the loop.....
//prompt the user with a message
//populate the array
//sum the scores
//After the inner loops brace....
//calculate the average by = (sum/3)
//populate row 1 of the scoresArray
//After the outer loops close brace.....
//display blank line
//display message
//setup for loop
//after the loops closing brace.....
//display blank line
//display End of Program message
	public static void main(String[] args) 
	{
     double [] [] scoresArray = new double [5] [3];
	 Scanner kb = new Scanner (System.in);
     int row = 0, column = 0, averageCounter = 0;
     averageCounter=0;
     double sum, average;
     average=0;
         for ( row=0; row<5; row++)
         {
         sum=0;
    	    for ( column=0; column<3; column++)
    	     {
             System.out.println("Enter Test Score");
             scoresArray[row][column]=kb.nextInt();
             sum=sum+scoresArray[row][column];
    	     }
          average=(sum/3);
          scoresArray[row][1]=average;
         }   
           System.out.println("");
           System.out.println("Calculated Results: ");
               for ( row=0; row<5; row++)
               {
                 System.out.println("Student " + (row+1) + " has a " + Math.round(scoresArray[row][1]) + " average.");
               }
                                 
       System.out.println("");
       System.out.println("End of Program");      
	}

}
