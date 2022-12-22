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
        if(x+y+z!=180)
            System.out.println("Error");
        else if(x==y && x==z)
            System.out.println("Equilateral");
        else if(x==y || y==z || x==z)
            System.out.println("Isosceles");
        else 
            System.out.println("Scalene");
        
        
    }
}