import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
	
		//user input
		Scanner ask = new Scanner(System.in);
		System.out.println("");
		x = ask.nextInt();
		System.out.println("");
		y = ask.nextInt();

		if(x<=2 && y<18 || x<2)
		    System.out.println("Before");
		else if(x>=2 && y>18 || x>2)
		    System.out.println("After");
		else 
            System.out.println("Special");


    }
}