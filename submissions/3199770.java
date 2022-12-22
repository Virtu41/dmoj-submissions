import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int q = 0;
		int c = 0;
		int total = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();		
		y= ask.nextInt();
		q = y*25;
		c = x*100;
		if(q>=c) 
		    System.out.print(0);
		else 
		{
		    total = (c-q)/25;
		    System.out.print(total);
		}
		    

            





    }
}