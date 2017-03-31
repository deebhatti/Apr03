package javaExamples;

public class Calculator {
	public Calculator(){
		
	}

	public void add(int a, int b) { 
		System.out.println(a+b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		Calculator basicCal = new Calculator();

		basicCal.add(10, 20);

		basicCal.subtract(50, 30);

		basicCal.multiply(60, 2);
		basicCal.divide(50, 5);

	}

}
