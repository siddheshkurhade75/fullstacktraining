package week2lab;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radius of circle :");
		double radius=scan.nextDouble();
		
		double area=3.14*radius*radius;
		System.out.println("area of circle is :"+area);
		
	}

}
