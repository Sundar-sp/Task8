package task08;

import java.util.Scanner;

public class Q7LengthOfTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String msg = sc.nextLine();
		sc.close();
		int length = msg.length();
		System.out.println("Length of the string is "+length);
	}

}
