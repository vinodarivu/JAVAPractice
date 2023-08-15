package javalearning.DesignPatterns;

/*The Abstract Factory Design Pattern is a creational design pattern that provides an interface for 
 * creating families of related or dependent objects without specifying their concrete classes.
 *  It is used to create instances of multiple related classes that belong to the same family of objects.
 *   This pattern helps ensure that the created objects are compatible and consistent.

Here's a brief explanation and example of the Abstract Factory Design Pattern in Java:

Suppose you're building a UI framework that needs to create different types of UI elements, 
such as buttons and checkboxes. You might have two types of UI element families: Light and Dark themes. 
The Abstract Factory Pattern allows you to create factories for each theme, and these factories can then 
produce consistent sets of UI elements.*/

// Abstract Product: Button
interface Button {
	void render();
}

// Concrete Products
class LightButton implements Button {
	@Override
	public void render() {
		System.out.println("Rendering a light button");
	}
}

class DarkButton implements Button {
	@Override
	public void render() {
		System.out.println("Rendering a dark button");
	}
}

// Abstract Factory
interface UIFactory {
	Button createButton();
}

// Concrete Factories
class LightUIFactory implements UIFactory {
	@Override
	public Button createButton() {
		return new LightButton();
	}
}

class DarkUIFactory implements UIFactory {
	@Override
	public Button createButton() {
		return new DarkButton();
	}
}

public class AbstractFactoryDesignPattern {
	public static void main(String[] args) {
		// Create a Light theme factory
		UIFactory lightFactory = new LightUIFactory();
		Button lightButton = lightFactory.createButton();
		lightButton.render();

		// Create a Dark theme factory
		UIFactory darkFactory = new DarkUIFactory();
		Button darkButton = darkFactory.createButton();
		darkButton.render();
	}
}

/*
 * In this example, the UIFactory is the abstract factory that defines the
 * interface for creating UI elements. LightUIFactory and DarkUIFactory are
 * concrete factories that implement the UIFactory interface to create
 * LightButton and DarkButton instances, respectively.
 * 
 * The Abstract Factory Pattern allows you to create different sets of related
 * objects (buttons in this case) without explicitly specifying their classes.
 * This pattern is particularly useful in scenarios where you want to ensure
 * that objects created together are consistent and compatible, such as creating
 * GUI elements for different themes.
 */
