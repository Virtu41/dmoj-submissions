import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int ax = 0;
		int ay = 0;
		int az = 0;
		int bx = 0;
		int by = 0;
		int bz = 0;
	    int totala = 0;
	    int totalb = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		System.out.println("");
		ax = ask.nextInt();
		System.out.println("");
		ay = ask.nextInt();
		System.out.println("");
		az = ask.nextInt();
		System.out.println("");
		bx = ask.nextInt();
		System.out.println("");
		by = ask.nextInt();
		System.out.println("");
		bz = ask.nextInt();
		
		totala=3*ax+2*ay+az;
		totalb=3*bx+2*by+bz;

        if(totala>totalb)
            System.out.print("A");
        else if(totala<totalb)
            System.out.print("B");
        else
            System.out.print("T");




    }
}