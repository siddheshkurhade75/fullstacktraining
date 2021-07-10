package week2lab;

import java.util.Scanner;

public class SwapingTwoNo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first no :");
		int i=scan.nextInt();
		
		System.out.println("enter second no :");
		int j=scan.nextInt();
		
		System.out.println("--Before swap--");
		 System.out.println("First number = " + i);
		 System.out.println("Second number = " + j);
		 // Value of first is assigned to temporary
		int temporary = i;
		 // Value of second is assigned to first
		i = j;
		 // Value of temporary (which contains the initial value of first) is assigned to j
		j = temporary;
		 System.out.println("--After swap--");
		 System.out.println("First number = " + i);
		 System.out.println("Second number = " + j);
	}

}
