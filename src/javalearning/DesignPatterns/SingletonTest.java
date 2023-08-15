package javalearning.DesignPatterns;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonTest {

	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {

		SingleObject so = SingleObject.getInstance();
		
		System.out.println(so);
		
		SingleObject so1 = SingleObject.getInstance();
		
		try {
		System.out.println(so.clone());
		}catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		
		ObjectOutput ob = new ObjectOutputStream(new FileOutputStream("singleObject.ser"));
		ob.writeObject(so);
		ob.flush();
		ob.close();
		
		ObjectInput oi = new ObjectInputStream(new FileInputStream("singleObject.ser"));
		SingleObject so2 = (SingleObject)oi.readObject();
		oi.close();
		System.out.println(so2);
		
		
		

	}

}

class SingleObject implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SingleObject() {
	}

	protected Object readResolve() {
		return getInstance();
	}

	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}

	private static final class ProcessSingleton {
		private static final SingleObject so = new SingleObject();
	}

	public static SingleObject getInstance() {
		return ProcessSingleton.so;
	}

}
