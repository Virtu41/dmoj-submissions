import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int pro = 0;
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();	
		for(int i = 1; i<=x;i++)
		{
            pro = x*i;
            System.out.println(x+" X "+i+" = "+pro);
		}
		            

            





    }
}