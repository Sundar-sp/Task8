package task08;

import java.util.Scanner;

public class Q10CountNumberOfDigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value: ");
		int a = sc.nextInt();
		sc.close();
		int count = 0;
		while(a>0) {
		a =a/10;
		count++;
		}
		System.out.println("Number of digit: "+count);
	}

}
