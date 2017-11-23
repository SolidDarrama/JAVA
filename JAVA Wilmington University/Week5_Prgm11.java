//jose guadarrama
//Found of Object-Oriented Program - SDD 315
//Program Assignment 11 - Finally Block

public class Week5_Prgm11 {

	  public static void main(String args[]){  
		  try{  
		   int result=10/0;  
		   System.out.println(result);  
		  }  
		  catch(ArithmeticException e){
			  System.out.println(e);
		  }  
		  finally{
			  System.out.println("finally block is always executed");}  
		  	  System.out.println("rest of the code...");  
		  }  
		}  