package javaExamples;

public class Shapes {
	static String color = "Yellow";
	int length;
	int breadth;

	public Shapes() {
		length = 3;
		breadth = 2;
	}

	public Shapes(int a, int b) {
		length = a;
		breadth = b;
	}

	public void area() {
		System.out.println("Area of rectangle = " + (length * breadth) + " cm. sq.");
	}

	public static void figureShape() {
		System.out.println("Shape of the figure = Rectangle");
	}

	public static void main(String[] args) {
		Shapes rectangle2 = new Shapes();
		rectangle2.area();
		figureShape();
		
		
//		Shapes rectangle1 = new Shapes(10,20);
//		rectangle1.area();

	}

}
