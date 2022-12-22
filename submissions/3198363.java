import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		double min = 0;
		double x = 0;
		int y = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		min = ask.nextDouble();		
		y= ask.nextInt();
		for(int i = 0; i<y; i++)
		{
		    x = ask.nextDouble();
		    if(x==1)
		        min-=0.5;
		    else if(x==2)
		        min-=1;
		    else if(x==3)
		        min-=5;
		}
		if(min<=0)
		    System.out.print("Return");
		else
		    System.out.print("Continue");
		       
        





    }
}