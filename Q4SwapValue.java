package task08;

import java.util.Scanner;

public class Q4SwapValue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value: ");
	int a = sc.nextInt();
	System.out.println("Enter b value: ");
	int b = sc.nextInt();
	System.out.println("before swapping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	int c;
	c=a;
	a=b;
	b=c;
	System.out.println("after swapped");
	System.out.println("a="+a);
	System.out.println("b="+b);
	sc.close();
}
}
