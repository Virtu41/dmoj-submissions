import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		String x;
        String y;
        int count = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextLine();		
        for(int i = 0; i<5; i++)
        {
			y= ask.nextLine();
            if(x.equals(y))
                count++;
        }
        if(count>=1)
            System.out.print("Y");
        else
            System.out.print("N");
		    

            





    }
}