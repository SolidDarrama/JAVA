//jose guadarrama
//Found of Object-Oriented Program - SDD 315
//Program Assignment 10

import java.io.FileReader;

public class Week5_Prgm10 {

    public static void main(String a[]){
        try{
            for(int i=5;i>=0;i--){
                System.out.println("10 / " + i + " = " + (10/i) + " R:" + (10%i));
            }
        } catch(Exception ex){
            System.out.println("Exception Message: "+ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("\tFor-loop has abruptly stopped!: 10 / (i = 0) is not doable");
    }
}
