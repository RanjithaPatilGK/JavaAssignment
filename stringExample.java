//Assignment 1:Program to create a string of length ‘n’. The value of ‘n’ is the sum of the user input which will be an integer.

package javaAssignment;
import java.util.Scanner;

public class stringExample {

	public static void main(String[] args) {
		int number;
		String C;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		number = scanner.nextInt();
		System.out.println("The Number entered by User is: " + number);
		System.out.print("Enter any String:");
		C = scanner.next();
		System.out.println("The String entered by user is: " + C);
		System.out.println("The sum of digit:" + stringExample.SumOfDigits(number));
		for (int i = SumOfDigits(number); i != 0; i--) {
			System.out.println(C);
		}

	}

	static int SumOfDigits(int number) {
		if (number < 10) {
			return number;
		} else {
			return number % 10 + SumOfDigits(number / 10);
		}
	}
}
