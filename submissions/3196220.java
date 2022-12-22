import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	    int x = 0;
	    int y = 0;
        Scanner ask = new Scanner(System.in);
        x = ask.nextInt();
        System.out.println("");
        y = ask.nextInt();
        System.out.println("");
        if(x>=3 && y<=4)
            System.out.println("TroyMartian");
        else 
            System.out.print("");
        if(x<=6 && y>=2)
            System.out.println("VladSaturnian");
        else
            System.out.print("");
        if(x<=2 && y<=3)
            System.out.println("GraemeMercurian");
        else 
            System.out.print("");




    }
}