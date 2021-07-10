package week2lab;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first no :");
		int i=scan.nextInt();
		
		System.out.println("enter second no :");
		int j=scan.nextInt();
		
		System.out.println("enter third no :");
		int k=scan.nextInt();
		
		if(i>=j && i>=k)
			System.out.println(i +"is the largest no");
		
		else if(j>=i && j>=k)
			System.out.println(j +"is the largest no");
		
		else
			System.out.println(k +"is the largest no");
		
	}

}
