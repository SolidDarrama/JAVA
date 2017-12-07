import java.util.Arrays;
import java.util.Scanner;
//jose guadarrama
//Found of Object-Oriented Program SDD 315
//12/6/2017
//
//Create a program of your choosing that uses classes, objects, methods, arrays, mathematical arithmetic, and strings. 
//It must use one of the design patterns learned in Week 6.

public class AdoptedDog {
	
	//Create a Singleton Class.
	public static class SingleObject {

		   //create an object of SingleObject
		   private static SingleObject instance = new SingleObject();

		   //make the constructor private so that this class cannot be
		   //instantiated
		   private SingleObject(){}

		   //Get the only object available
		   public static SingleObject getInstance(){
		      return instance;
		   }

		   public void showMessage(){
		      System.out.println("\nCongratulations");
		   }
	}

    public static void main(String[] args) {
		String[] dogList = new String[4];
		
		dogList[0] = "Scooby";
		dogList[1] = "Sparky";
		dogList[2] = "DogMeat";
		dogList[3] = "Rex";
		
		System.out.println("Dogs available for adoption: ");
		for (int i = 0; i < 4; i++)
		System.out.println(dogList[i]);
		
	    Scanner scanner = new Scanner( System.in );
	    System.out.println("\nEnter the name of the dog you want to adopt:");
	    String input = scanner.nextLine();
	    
	    //Get the only object from the singleton class; Design Pattern Singleton Pattern
	    SingleObject object = SingleObject.getInstance();
	    
	    
	    if(Arrays.asList(dogList).contains(input)){
	    	object.showMessage();
	    	System.out.println("You adopted " + input );
	    }
	    else
	    {
	    	int x = 405, y = 1;
	    	int z = x - y;
	    	System.out.println("\tERROR " + z + ":\n\tInput name is incorrect.\n\tDog name is not found in the database!\n\tTry again.");
	    } 

   }

}
