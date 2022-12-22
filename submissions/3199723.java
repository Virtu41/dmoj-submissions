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
		
        if(x>=90 && y>=90)
            System.out.print("Same");
        else if((x>=80 && x<90) && (y>=80 && y<90))
            System.out.print("Same");
        else if((x>=70 && x<80) && (y>=70 && y<80))
            System.out.print("Same");
        else if((x>=60 && x<70) && (y>=60 && y<70))
            System.out.print("Same");
        else if(x<60 && y<60)
            System.out.print("Same");
        else
            System.out.print("Different");
            





    }
}