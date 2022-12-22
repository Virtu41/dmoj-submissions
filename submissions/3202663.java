import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 1;
		int y = 0;
		
		Scanner ask = new Scanner(System.in);
        while(x<=100)
        {
            y= ask.nextInt();

			if(y>12 || y<0 || y==1)
				continue;
			else if(x+y>100)
			{
			    System.out.println("You are now on square "+x);
			    continue;
			}
			else
			{
			x+=y;
            if(x==54)
              x=19;
            else if(x==90)
                x=48;
            else if(x==9)
                x=34;
            else if(x==40)
                x=64;
            else if(x==67)
                x=86;
            else if(x==99)
                x=77;

			else if(y==0)
			{
				System.out.print("You Quit!");
				break;
			}
            
            }
            if(x==100)
            {
                System.out.println("You are now on square "+ x);
                System.out.println("You Win!");
                break;
            }
            else
                System.out.println("You are now on square "+x);
        


		}
            ask.close();

    }
}