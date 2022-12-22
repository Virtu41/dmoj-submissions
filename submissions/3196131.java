import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	    int x = 0;
        int y = 0;
        int z = 0;
        Scanner ask = new Scanner(System.in);
        x = ask.nextInt();
        System.out.println("");
        y = ask.nextInt();
        System.out.println("");
        z = ask.nextInt();
        if((x <y&&z<x) || (x<z&&y<x))
            System.out.println(x);
        else if((y<x && z<y) || (y<z && x<y))
            System.out.println(y);
        else if((z<y && x<z) || (x<x && y<x))
            System.out.println(z);


    }
}