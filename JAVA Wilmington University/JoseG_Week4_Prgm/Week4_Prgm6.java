//jose guadarrama
//11/14/2017
//Week 4 Programming Assignment 6

import java.util.Scanner;
public class Week4_Prgm6 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Simple Adding Calculator");
		System.out.println("Enter first number:");
		int num = in.nextInt();
		System.out.println("Enter second number:");
		int num2 = in.nextInt();
		
		int result = num + num2;
		System.out.println("Result is " + result);

	}

}
