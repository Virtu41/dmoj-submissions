import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		String x;

		//user input
		Scanner ask = new Scanner(System.in);
		System.out.println("");
		x = ask.nextLine();
        
        char someCharB = 'B';
        char someCharF = 'F';
        char someCharT = 'T';
        char someCharL = 'L';
        char someCharC = 'C';
        
        int countb = 0;
        int countf = 0;
        int countt = 0;
        int countl = 0;
        int countc = 0;
        
        for (int i = 0; i < x.length(); i++) 
        {
		    if(x.charAt(i) == someCharB) 
			    countb++;
			else if(x.charAt(i) == someCharF)
			    countf++;
			else if(x.charAt(i) == someCharT)
		    	countt++;
			else if(x.charAt(i) == someCharL)
			    countl++;
			else if(x.charAt(i) == someCharC)
			    countc++;
        }
        if(countb>0&&countf>0&&countt>0&&countl>0&&countf>0)
            System.out.println("NO MISSING PARTS");
        if(countb == 0)
            System.out.println("B");
        if(countf == 0)
            System.out.println("F");
        if(countt == 0)
            System.out.println("T");
        if(countl == 0)
            System.out.println("L");
        if(countc == 0)
            System.out.println("C");
        
			
		        





    }
}