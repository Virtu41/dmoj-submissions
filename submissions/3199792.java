import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;

		int total = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();		
        if(x<10)
        {
            total = 10-x;
            System.out.print(total);
        }
        else if(x<100)
        {
            total = 100-x;
            System.out.print(total);
        }
        else
        {
            total = 1000-x;
            System.out.print(total);
        }
		    

            





    }
}