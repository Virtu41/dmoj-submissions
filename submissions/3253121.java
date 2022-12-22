import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int num = 0;
		int count = 0;
		int z = 0;

		Scanner ask = new Scanner(System.in);
		z = ask.nextInt();
		for(int k = 0; k<z; k++)
		{
			int pri = 0;
			x = ask.nextInt();
			y = ask.nextInt();
		
		for(int i = x;i<y;i++)
		{
		    num=i;
		    for(int j = 2; j<=num;j++)
		    {
		        if(num%j==0)
		            count++;

		    }
		    if(count == 1)
			{
		        pri++;
				count = 0;
			}
			else
				count = 0;
		}
		System.out.println(pri);
		}
		            

            





    }
}