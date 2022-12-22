import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    int x = 0;
    int p = 0;
    Scanner ask = new Scanner(System.in);
	x = ask.nextInt();
	p = 5*x-400;
	System.out.println(p);
	if(p<100)
	    System.out.println(1);
	else if(p>100)
	    System.out.println(-1);
	else
	    System.out.println(0);
		            

    }
}