package javalearning.DesignPatterns;

/*
 * he Builder Design Pattern is a creational design pattern in Java that is used
 * to construct complex objects step by step. It separates the construction of a
 * complex object from its representation, allowing the same construction
 * process to create different representations. This pattern is particularly
 * useful when you have objects with many optional parameters or configurations.
 * 
 * Here's a brief explanation and a real-time example of the Builder Design
 * Pattern:
 * 
 * Real-Time Example: Building a House
 * 
 * Imagine you're building a house. The process involves several steps and
 * various optional features like the type of roof, flooring, windows, and so
 * on. The Builder Design Pattern can help manage this complexity.
 */

//Product class
class House {
	private String foundation;
	private String structure;
	private String roof;
	private String windows;
	private String doors;
	private String flooring;

	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public void setWindows(String windows) {
		this.windows = windows;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public void setFlooring(String flooring) {
		this.flooring = flooring;
	}

	@Override
	public String toString() {
		return "House{" + "foundation='" + foundation + '\'' + ", structure='" + structure + '\'' + ", roof='" + roof
				+ '\'' + ", windows='" + windows + '\'' + ", doors='" + doors + '\'' + ", flooring='" + flooring + '\''
				+ '}';
	}
}

//Abstract builder interface
interface HouseBuilder {
	void buildFoundation();

	void buildStructure();

	void buildRoof();

	void buildWindows();

	void buildDoors();

	void buildFlooring();

	House getHouse();
}

//Concrete builder class
class ConcreteHouseBuilder implements HouseBuilder {
	private House house = new House();

	@Override
	public void buildFoundation() {
		house.setFoundation("Concrete foundation");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Concrete structure");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Concrete roof");
	}

	@Override
	public void buildWindows() {
		house.setWindows("Glass windows");
	}

	@Override
	public void buildDoors() {
		house.setDoors("Wooden doors");
	}

	@Override
	public void buildFlooring() {
		house.setFlooring("Tile flooring");
	}

	@Override
	public House getHouse() {
		return house;
	}
}

//Director class
class CivilEngineer {
	private HouseBuilder builder;

	CivilEngineer(HouseBuilder builder) {
		this.builder = builder;
	}

	House construct() {
		builder.buildFoundation();
		builder.buildStructure();
		builder.buildRoof();
		builder.buildWindows();
		builder.buildDoors();
		builder.buildFlooring();
		return builder.getHouse();
	}
}

public class BuilderDesignPattern {
	public static void main(String[] args) {
		HouseBuilder builder = new ConcreteHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(builder);
		House house = engineer.construct();

		System.out.println("Constructed House:\n" + house);
	}
}

/*
 * In this example, the Builder Design Pattern is used to build a house. The
 * House class represents the complex object being built. The HouseBuilder
 * interface defines the steps required to build the house, and the
 * ConcreteHouseBuilder implements those steps. The CivilEngineer class acts as
 * a director, orchestrating the building process. The process of building a
 * house is divided into distinct steps, making it easy to manage the
 * construction of complex objects while allowing flexibility in choosing the
 * components.
 * 
 * The Builder Design Pattern is particularly useful in scenarios where you have
 * many optional components and variations in the final object's configuration,
 * as demonstrated in the house-building example.
 */
