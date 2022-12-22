import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int num = 0;
		int count = 0;

		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();

		
		while(x%2==0)
		{
			x/=2;
			System.out.println(2);
		}
		    
		for(int i = 3; i<=x;i+=2)
		{		
		  while(x%i==0)
		  {
			System.out.println(i);
			x/=i;
		  }
		            

		}
		            

            





    }
}