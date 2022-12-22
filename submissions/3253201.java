import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner ask = new Scanner(System.in);
        x = ask.nextInt();
        for(int i = 0;i<x; i++)
        {
            y = ask.nextInt();
            if(y>79&&y<101)
                System.out.println("A");
            else if(y>69&&y<80)
                System.out.println("B");
            else if(y>59&&y<70)
                System.out.println("C");
            else if(y>49&&y<60)
                System.out.println("D");
            else if(y>=0&&y<50)
                System.out.println("F");
            else
                System.out.println("X");
        }
        
         

            





    }
}