import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	    int x = 0;
        Scanner ask = new Scanner(System.in);
        x = ask.nextInt();
        System.out.println("");
        int ex = (int)Math.sqrt(x);
        if(ex*ex==x)
            System.out.println("The largest square has side length "+ex+".");
        else if(ex*ex!=x)
        {
            while((int)Math.sqrt(x)!=ex)
                x++;
            System.out.println("The largest square has side length "+ex+".");
        }
        else
            return;



    }
}