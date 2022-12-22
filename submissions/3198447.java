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
		x = ask.nextInt();		
		y= ask.nextInt();
		z=ask.nextInt();
        total = 1*x+2*y+3*z;
        if(total >=10)
            System.out.print("happy");
        else
            System.out.print("sad");
            





    }
}