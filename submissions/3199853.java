import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int totalx = 0;
		int totaly = 0;
		//user input
		Scanner ask = new Scanner(System.in);

        for(int i = 1; i<=7;i++)
        {
        	x = ask.nextInt();		
		    y= ask.nextInt();
            if(x>y)
                totalx++;
            else if(x<y)
                totaly++;
            if(totalx==4 || totaly==4)
                break;
        }
        System.out.print(totalx+" "+totaly);
                
            
                

            





    }
}