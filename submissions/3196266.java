import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int slimit = 0;
		int speed = 0;
	
		//user input
		Scanner ask = new Scanner(System.in);
		System.out.println("");
		slimit = ask.nextInt();
		System.out.println("");
		speed = ask.nextInt();
        if(speed <= slimit)
           System.out.println("Congratulations, you are within the speed limit!"); //output 
		else if(speed-slimit<=20)
			System.out.println("You are speeding and your fine is $100."); //output
		else if(speed-slimit>20 && speed-slimit<=30)
			System.out.println("You are speeding and your fine is $270."); //output
			
		else if(speed-slimit>=31)
			System.out.println("You are speeding and your fine is $500."); //output
			
			
		else
			System.out.println("Congratulations, you are within the speed limit!"); //output



    }
}