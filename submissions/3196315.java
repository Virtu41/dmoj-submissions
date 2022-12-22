import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		String y;
	
		//user input
		Scanner ask = new Scanner(System.in);

		x = ask.nextInt();
		System.out.println("");
		y = ask.nextLine();
		y = ask.nextLine();
		System.out.println("");
		
		char someChar = 'A';
		int count = 0;
 
		for (int i = 0; i < y.length(); i++) 
			if(y.charAt(i) == someChar) {
				count++;
			}
		
		
			if(x==count+count)
				System.out.println("Tie");
			else if(x-count>count)
				System.out.println("B");
			else
				System.out.println("A");
		




    }
}