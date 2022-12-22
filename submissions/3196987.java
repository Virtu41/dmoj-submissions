import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int n = 0;
		int k = 0;
	
		Scanner ask = new Scanner(System.in);
		System.out.println("");
	    n = ask.nextInt();
		System.out.println("");
		k = ask.nextInt();
		int total = n;

        for(int i =0; i<k; i++)
		{
			n*=10;
            total+=n;
		}
        System.out.print(total);


    }
}