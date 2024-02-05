package task08;

import java.util.Scanner;

public class Q5PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		sc.close();
		int i = 2;
		boolean prime = true;
		while (i <a) {
			if(a%i==0) {
				System.out.println("Given number is not prime number");
				prime = false;
				break;
			}
			i++;
		}
		if(prime == true) {
			System.out.println("Given number is prime number");
		}
	}

}
