package week2lab;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter dividend :");
		int dividend=scan.nextInt();
				
		System.out.println("enter divisor :");
		int divisor=scan.nextInt();
				
		 int quotient = dividend / divisor;
		 int remainder = dividend % divisor;
		 System.out.println("Quotient = " + quotient);
		 System.out.println("Remainder = " + remainder); 
	}

}
