package javalearning.Exceptions;

public class Finaltryblock {
	public static void main(String args[]) {
		int a = getvalue();
		System.out.println(a);
	}

	private static int getvalue() {
		try {
			return 10;
		} catch (Exception e) {
			return 20;
		} finally {
			return 30;
		}
	}

}
