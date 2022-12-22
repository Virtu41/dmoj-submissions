import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();	
		for(int i = 0; i<x;i++)
		{
            y = ask.nextInt();
            if(y<=45)
                System.out.print("N");
            else if(y>45&&y<=135)
                System.out.print("E");
            else if(y>135&&y<=225)
                System.out.print("S");
            else if(y>225&&y<315)
                System.out.print("W");
            else
                System.out.print("N");
		}
		            

            





    }
}