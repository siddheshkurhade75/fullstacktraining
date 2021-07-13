package week2lab;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);	
    System.out.println("enter the length of rectangle:");
    double length=scan.nextDouble();
    
    System.out.println("enter the width of rectangle:");
    double width=scan.nextDouble();
    
    double Area=length*width;
    System.out.println("area of rectangle is :"+Area);
	}

}
