package task08;

import java.util.Scanner;

public class Q1IfStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a = input.nextInt();
		System.out.println("Enter value for b: ");
		int b = input.nextInt();
		System.out.println("Enter value for c: ");
		int c = input.nextInt();
		System.out.println("Enter value for d: ");
		int d = input.nextInt();
		if((a+b)>(c+d)) {
			System.out.println("The sum of a and b is greater then the sum of c an d");
		}
		input.close();
	
	}	
}
