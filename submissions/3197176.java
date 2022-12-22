import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
	    int s = 1;
		//user input
		Scanner ask = new Scanner(System.in);
		System.out.println("");
		x = ask.nextInt();
		System.out.println("");
		y = ask.nextInt();
		System.out.println("All positions change in year "+x);
		for(int i = x; i<=y; i++)
		    if(i==x+60*s)
		    {
		        System.out.println("All positions change in year "+ i);
		        s++;
		    }
		        





    }
}