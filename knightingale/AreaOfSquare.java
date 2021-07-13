package week2lab;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the side of square :");
		double side=scan.nextDouble();
		
		double area=side*side;
		System.out.println("area of square is :"+area);
	}

}
