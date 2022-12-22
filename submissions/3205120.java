import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		String x;
        int s = 0;
        int d = 0;

		int total = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextLine();		
            for(int  i = 0; i<x.length()-2;i++)
            {
                String sys = x.substring(i,i+3);
                if(sys.equals(":-)"))
                    s++;
                else if(sys.equals(":-("))
                    d++;
            }
		    if(s>d)
		        System.out.print("happy");
		    else if(s<d)
		        System.out.print("sad");
		    else if(s==d && (s>0 &&d>0))
		        System.out.print("unsure");
		    else 
		        System.out.print("none");
		        

            





    }
}