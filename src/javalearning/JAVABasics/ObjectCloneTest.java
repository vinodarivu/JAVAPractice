package javalearning.JAVABasics;

/*
 * To use the Object.clone() method, we have to change a lot of syntaxes to our
 * code, like implementing a Cloneable interface, defining the clone() method
 * and handling CloneNotSupportedException, and finally, calling Object.clone()
 * etc. We have to implement cloneable interface while it doesn't have any
 * methods in it. We just have to use it to tell the JVM that we can perform
 * clone() on our object. Object.clone() is protected, so we have to provide our
 * own clone() and indirectly call Object.clone() from it. Object.clone()
 * doesn't invoke any constructor so we don't have any control over object
 * construction. If you want to write a clone method in a child class then all
 * of its superclasses should define the clone() method in them or inherit it
 * from another parent class. Otherwise, the super.clone() chain will fail.
 * Object.clone() supports only shallow copying but we will need to override it
 * if we need deep cloning.
 */

class superCloneClass {

}

public class ObjectCloneTest extends superCloneClass implements Cloneable {
	int rollno;
	String name;

	public ObjectCloneTest(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	public static void main(String args[]) {
		try {
			ObjectCloneTest s1 = new ObjectCloneTest(101, "amit");

			ObjectCloneTest s2 = (ObjectCloneTest) s1.clone();
			ObjectCloneTest s3 = s1;
			// s1.setName("Vinod");

			System.out.println(s1.rollno + " " + s1.name + "==S1 HASHCODE===>" + s1.hashCode());
			System.out.println(s2.rollno + " " + s2.name + "==S2 HASHCODE===>" + s2.hashCode());
			System.out.println("see the difference between clone and assign ==>\n" + s3.rollno + " " + s3.name
					+ "==S3 HASHCODE===>" + s3.hashCode());
			System.out.println("*********************after Changing the Name value in S1************************************");
			s1.setName("Vinod");
			System.out.println(s1.rollno + " " + s1.name + "==S1 HASHCODE===>" + s1.hashCode());
			System.out.println(s2.rollno + " " + s2.name + "==S2 HASHCODE===>" + s2.hashCode());
			System.out.println("see the difference between clone and assign ==>\n" + s3.rollno + " " + s3.name
					+ "==S3 HASHCODE===>" + s3.hashCode());
		

		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Exception");
		}

	}

}
