package task08;

import java.util.Scanner;

public class Q2EvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		int a = sc.nextInt();
		if(a%2==0) {
	System.out.println("Given number is Even");
		}else {
			System.out.println("Given number is Odd");
		}
		sc.close();
	}

}
