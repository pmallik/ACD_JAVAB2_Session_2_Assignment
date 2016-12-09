import java.util.Scanner;

public class ACD_JAVAB2_Session_2_Assignment_4 {

	public static void main(String[] args) {
		// Session 2 Assignment 3
		// Write a program to find the highest among given 3 numbers
		// Take input of 3 numbers
		Scanner s=new Scanner(System.in);//Creating Object of Scanner
		System.out.println("Enter x: ");
		int x = s.nextInt();
		System.out.println("Enter y: ");
		int y = s.nextInt();
		System.out.println("Enter z: ");
		int z = s.nextInt();
		s.close();
		
		
		if (x > y && x > z)
		{
			System.out.println("Highest n umber is x= " + x);
		}
		else if (y > z)
		{
			System.out.println("Highest number is y= " + y);
		}
		else
		{
			System.out.println("Highest number is z=" + z);
		}
		

	}

}
