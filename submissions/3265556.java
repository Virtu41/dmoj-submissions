import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		double y = 0;
        double mini = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();	
		for(int i = 0; i<x;i++)
		{
		    y = ask.nextDouble();
		    if(i == 0)
		    {
		        mini = y;
		        continue;
		    }
		    mini = Math.min(y, mini);
		}
		System.out.print(mini);
		    
		    

		    
    }
}