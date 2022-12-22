import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    String c = "";
    String r = "IOSHZXN";
    boolean am = true;
    Scanner ask = new Scanner(System.in);
    c = ask.nextLine();
    for(int i = 0;i<c.length();i++)
    {
        char ch = c.charAt(i);
        if(r.indexOf(ch)==-1)
            am = false;
    }
    if(am == true)
        System.out.print("YES");
    else
        System.out.print("NO");
		            

            





    }
}