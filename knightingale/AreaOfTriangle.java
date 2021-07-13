package week2lab;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the base of triangle :");
		double base=scan.nextDouble();
		
		System.out.println("enter the height of triangle :");
		double height=scan.nextDouble();
		
		double area= 0.5*base*height;
		System.out.println("area of triangle is :"+area);
	}

}
