import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		String y = "";
		//user input
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();	
		ask.nextLine();
		for(int i = 0; i<x;i++)
		{
            y = ask.nextLine().toLowerCase();
            System.out.println(y);
            
		}
		            

            





    }
}