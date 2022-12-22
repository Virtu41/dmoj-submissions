import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		String x;
		String o = "java";
		int findo = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextLine();	
        findo = x.indexOf(o);
        if(findo!=-1)
            System.out.print(findo);
        else
            System.out.print(x.length());
        

		            

            





    }
}