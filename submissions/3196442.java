import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int w = 0;
		int x = 0;
		int y = 0;
		int z = 0;
	    int maths = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		System.out.println("");
		w = ask.nextInt();
		System.out.println("");
		x = ask.nextInt();
		System.out.println("");
		y = ask.nextInt();
		System.out.println("");
		z = ask.nextInt();

		if(w==1)
		    w=461;
		else if(w==2)
		    w=431;
		else if(w==3)
		    w=420;
		else
		    w=0;
		    
		if(x==1)
		    x=100;
		else if(x==2)
		    x=57;
		else if(x==3)
		    x=70;
		else
		    x=0;
		    
		if(y==1)
		    y=130;
		else if(y==2)
		    y=160;
		else if(y==3)
		    y=118;
		else
		    y=0;
		    
		if(z==1)
		    z=167;
		else if(z==2)
		    z=266;
		else if(z==3)
		    z=75;
		else
		    z=0;
	maths = w+x+y+z;
	System.out.println("Your total Calorie count is "+maths+".");

		


    }
}