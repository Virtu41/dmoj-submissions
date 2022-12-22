import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int w = 0;
		int x = 0;
		int y = 0;
		int z=0;
	
		//user input
		Scanner ask = new Scanner(System.in);
		System.out.println("");
		w = ask.nextInt();
		System.out.println("");
		x = ask.nextInt();
		System.out.println("");
		y = ask.nextInt();
		System.out.println("");
		z = ask.nextInt();
		
		if(x==y && (w==8 || w==9)&&(z==8||z==9))
		    System.out.println("ignore");
		else
		    System.out.println("answer");



    }
}