import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	    double x = 0;
	    double y = 0;
        Scanner ask = new Scanner(System.in);
        x = ask.nextDouble();
        System.out.println("");
        y = ask.nextDouble();
        System.out.println("");
        double h = y*y;
        if(x/h>25)
            System.out.println("Overweight");
        else if(x/h>=18.5 && x/h<=25)
            System.out.println("Normal weight");
        else
            System.out.println("Underweight");
 




    }
}