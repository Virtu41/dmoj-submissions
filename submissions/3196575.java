import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
	    int total = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		System.out.println("");
		x = ask.nextInt();
		System.out.println("");
		y = ask.nextInt();
		System.out.println("");
		z = ask.nextInt();
		
		total = 91+x*1+y*3+z*1;
		System.out.print("The 1-3-sum is "+total);
		





    }
}