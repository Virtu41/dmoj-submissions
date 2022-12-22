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

		if(x>0 && y>0)
		    System.out.println("1");
		else if(x<0 && y>0)
		    System.out.println("2");
		else if(x>0 && y<0)
		    System.out.println("4");
		else
		    System.out.println("3");



    }
}