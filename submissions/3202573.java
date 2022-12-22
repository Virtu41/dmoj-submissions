import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int total = 0;
		double ans = 0;
		int l = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();		
		y= ask.nextInt();
		for(l = 1; l<x; l++)
		{
			total = y*(x-l)+1;
			ans = total/x;

			if(total == ans*x)
			{
				System.out.print((int)ans);
				System.exit(0);
			}
		}
		System.out.println("No such integer exists.");
		

		    

            





    }
}