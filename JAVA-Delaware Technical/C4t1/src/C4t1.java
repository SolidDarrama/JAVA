import java.util.Scanner;

//Jose Guadarrama
//09.19.2013
//Chapter 4 Test 1
public class C4t1 
{

	public static void main(String[] args) 
	{
        int scoreOne, scoreTwo, scoreThree, sumOfScores;
		
        double averageScore;
        
		System.out.println("Enter 3 Exam Scores:");

		Scanner kb = new Scanner(System.in);
		
		scoreOne = kb.nextInt();
		
		scoreTwo = kb.nextInt();
		
		scoreThree = kb.nextInt();
		
		sumOfScores=scoreOne+scoreTwo+scoreThree;
				
		averageScore=(((double)sumOfScores)/3);
		
	    if (averageScore>=75)
			{
		      System.out.println("Student has a passing average of " + averageScore);
			}
			else
			    {
				System.out.println("Student has a failing average of " + averageScore);
			    }	
	}		
}
