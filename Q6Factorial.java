package task08;

import java.util.Scanner;

public class Q6Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int n = sc.nextInt();
		sc.close();
		int fact = n;
		for(int i = 1; i<n; i++) {
			fact = fact * i;   
		}
		System.out.println("Factorial is "+fact);
		
	}

}
