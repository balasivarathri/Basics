package ConditionalStatements;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("Enter a value \n");
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		System.out.println("Enter b value");
		Scanner y = new Scanner(System.in);
		int b = y.nextInt();
		System.out.println("Enter c value");
		Scanner z = new Scanner(System.in);
		int c = z.nextInt();
		if (a>b && a>c)
			System.out.println(a + " is the Largest Number");
		else if(b>c && b>a)
			System.out.println(b + " is the Largest Number ");
		else
			System.out.println(c + " is the Largest Number");

	}

}
