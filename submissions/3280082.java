import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
		int x= 0;
		x= ask.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i<x; i++)
		{
			int y = ask.nextInt();
			numbers.add(y);
		}
		Collections.sort(numbers);
		for(int i = 0; i<numbers.size();i++)
			System.out.println(numbers.get(i));	
		            

            





    }
}