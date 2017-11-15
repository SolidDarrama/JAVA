//Jose Guadarrama
//Programming Assignment #5
//Week 2
//10-31-2017

public class Week2_Prgm3 {

	static String msg;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int evenNum = 0, oddNum = 0;	
	int[] anArray = new int[10];
	anArray[0] = 34;
	anArray[1] = 53;
	anArray[2] = 125;
	anArray[3] = 854;
	anArray[4] = 8;
	anArray[5] = 1045;
	anArray[6] = 66;
	anArray[7] = 9434;
	anArray[8] = 5205;
	anArray[9] = 235;
	
	for(int i = 0; i < anArray.length; i++) {
			System.out.println(anArray[i]);
			int number = 0;
			if((anArray[i]%2)==0)
			{
			 number = 2;
			}

			switch (number){
			case 2: evenNum++;
			break;
			default: oddNum++;
			}	
		}
	    System.out.println("\nThere are " + evenNum + " even number.\nThere are " + oddNum + " odd numbers\n");
	    evenOdd(evenNum, oddNum);
	    System.out.println(getMessage());
	}
	
	public static void evenOdd(int evenDub, int oddDub) {
		int signum = Long.signum((long)evenDub - oddDub);
		String returnMsg = "";
		switch(signum) {
		    case -1: returnMsg = "More odd than even";
		    break;
		    case 0: returnMsg = "Same amount of even & odd numbers"; 
		    break;
		    case 1: returnMsg = "More even than odd";
		    break;
			}
		msg = returnMsg;
		}
	
	public static String getMessage() {
		return msg;
	}
  }

