import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int acount = 100;
		int dcount = 100;
		int a = 0;
		int d = 0;
		int r = 0;
	
		//user input
		Scanner ask = new Scanner(System.in);
		System.out.println("");
		r = ask.nextInt();

        for(int i=0;i<r;i++)
        {
            System.out.println("");
            a = ask.nextInt();
            System.out.println("");
            d = ask.nextInt();
            if(a<d)
                acount-=d;
            else if(a>d)
                dcount-=a;
            else
                continue;
        }
        System.out.println(acount);
        System.out.println(dcount);



    }
}