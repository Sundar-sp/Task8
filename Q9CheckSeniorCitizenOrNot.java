package task08;

import java.util.Scanner;

public class Q9CheckSeniorCitizenOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person's age: ");
		int age = sc.nextInt();
		sc.close();
		if(age<60) {
			System.out.println("The Person is not a senior citizen");
		}else {
			System.out.println("The Person is a senior citizen");
		}

	}

}
