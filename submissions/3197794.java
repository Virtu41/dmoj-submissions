import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();		
		y= ask.nextInt();
		z=ask.nextInt();
        int total = x*(int)Math.pow(y, z);
        System.out.print(total);
            





    }
}