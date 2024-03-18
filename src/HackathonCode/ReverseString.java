package HackathonCode;

public class ReverseString {

	public static void main(String args[]) {
		processReverseString("HELLO VINODH KUMAR BUSINENI");

	}

	private static void processReverseString(String val) {
		char[] a = val.toCharArray();
		String reverseString = "";
		for (int i = a.length - 1; i >=0; i--) {
			reverseString = reverseString + a[i];
		}
		System.out.println(reverseString);

	}

}
