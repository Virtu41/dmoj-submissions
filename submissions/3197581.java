import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
        int num = 0;
        int total = 0;
        int count = 0;
		Scanner ask = new Scanner(System.in);
		x = ask.nextInt();
		y = ask.nextInt();
		for(int i = x; i<=y ; i++)
		{
		    num = i;
		    count = 2;
		    for(int j=2; j<num; j++)
		    {
		        if(num%j==0)
		        count++;
		    }
		    if(count ==4)
		        total++;
		}
        System.out.println("The number of RSA numbers between "+x+" and "+ y+ " is "+ total);




    }
}