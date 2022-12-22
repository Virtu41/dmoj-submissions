import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		String y;

		int cat = 0;
		int dog = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();		
        for(int i = 0; i<=x; i++)
        {
			y= ask.nextLine();
            if(y.equals("cats"))
                cat++;
            else if(y.equals("dogs"))
                dog++;

        }
        if(dog>cat)
            System.out.print("dogs");
        else if(dog<cat)
            System.out.print("cats");
        else if(dog==cat)
            System.out.print("equal");



    }
}