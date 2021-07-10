package week2lab;

import java.util.Scanner;

public class Multiplication { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value for i:");
		int i =scan.nextInt();
		
		System.out.println("enter the value for j:");
		int j =scan.nextInt();
		int mul=i*j;
		System.out.println("value of mul is :"+mul);
	}

}
