import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int a = 0;
		int b = 0;
		int c = 0;
        int count = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();	
		for(int i = 0; i<x;i++)
		{
		    a = ask.nextInt();
		    b = ask.nextInt();
		    c = ask.nextInt();
		    if(a>=240&&a<=255&&b<=200&&c>=95&&c<=220)
		        count++;

		}
		System.out.println(count);
		            

            





    }
}