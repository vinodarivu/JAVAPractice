package javalearning.DesignPatterns;


//The Adapter Design Pattern is a structural design pattern in Java that allows objects with 
//incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces, 
//converting the interface of one class into another interface that clients expect. This pattern is particularly 
//useful when integrating existing or third-party code that can't be easily modified to match the required interface.
//
//Here's a brief explanation and example of the Adapter Design Pattern in Java:
//
//Suppose you have an existing LegacyRectangle class that represents rectangles using two distinct methods for 
//specifying their dimensions:

class LegacyRectangle {
	void draw(int x1, int y1, int x2, int y2) {
		System.out.println("Drawing a rectangle: (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
	}
}
//Now, you want to use a new Rectangle class that expects width and height to draw rectangles. 
//However, the interfaces are different. This is where the Adapter Pattern comes in:

// Target Interface
interface Rectangle {
	void draw(int width, int height);
}

// Adapter class
class LegacyRectangleAdapter implements Rectangle {
	private LegacyRectangle legacyRectangle;

	LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
		this.legacyRectangle = legacyRectangle;
	}

	@Override
	public void draw(int width, int height) {
		int x1 = 0;
		int y1 = 0;
		int x2 = width;
		int y2 = height;
		legacyRectangle.draw(x1, y1, x2, y2);
	}
}

public class AdaptorDesignPattern {
	public static void main(String[] args) {
		// Using the Adapter to draw a rectangle using the new interface
		Rectangle rectangle = new LegacyRectangleAdapter(new LegacyRectangle());
		rectangle.draw(10, 5);
	}
}

//In this example, the LegacyRectangleAdapter class acts as an adapter between the Rectangle interface and
//the existing LegacyRectangle class. It translates the new interface's method call into the format expected
//by the old class. Now, you can use the Rectangle interface to draw rectangles using the LegacyRectangle code
//without modifying the original LegacyRectangle class.
//
//The Adapter Design Pattern provides a way to integrate different interfaces, making code reuse and integration
//smoother when working with legacy code or third-party libraries.
