package javaExamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		try {
			System.out.println("Please enter the first number:");
			int num1 = k.nextInt();

			System.out.println("Please enter the second number:");
			int num2 = k.nextInt();

			System.out.println("Result of division of " + num1 + " with " + num2 + " = " + (num1 / num2));
		}

		catch (ArithmeticException pizza) {
			System.out.println("Please do not enter a zero in the denominator");

		}

		catch (InputMismatchException Burger) {
			System.out.println("Please enter only integer values ");
		}

		catch (Exception e) {
			System.out.println("Please enter a valid input");
		}

	}

}
