//Jose Guadarrama
//09.26.2013
//Chapter 5 Lab
public class C5e2
{

	public static void main(String[] args) 
	{
	 System.out.println("Max integer value in first call is " + maxValue(1,2,3));
	 System.out.println("Max integer value in second call is " + maxValue(2,3,1));
	 System.out.println("Max integer value in three call is " + maxValue(3,1,2));
	}
    //------------------------MaxValue-------------------------
	public static int maxValue(int numOne, int numTwo, int numThree)
	{
	    if (numOne < numTwo)
	     if (numTwo<numThree)	
		      return numThree;
		 else
			  return numTwo;
		 else
	    	if (numOne < numThree)
		      return numThree;
	     else
			    {
				return numOne;
			    }
	}
}
