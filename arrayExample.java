//Assignment 2:Program to add elements in array. Create an array of integer and add few user inputs (marks). Print the Grand Total of marks.
package javaAssignment;

import java.util.Scanner;

public class arrayExample {

	public static void main(String[] args) {
		int array[] = new int[10];
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of elements you want to store in an array: ");
		n = sc.nextInt();
		System.out.println("Enter the elements for the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of all the elements of an array: " + sum);
	}

}

