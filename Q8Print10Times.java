package task08;

import java.util.Scanner;

public class Q8Print10Times {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String a = sc.nextLine();
		sc.close();
		System.out.println();
		int i = 0;
		while(i<10){
		System.out.println(a);
		i++;
		}
	}

}
