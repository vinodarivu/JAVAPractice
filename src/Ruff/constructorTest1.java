package Ruff;

public class constructorTest1 {

	int test_a, test_b;
	//constructorTest1(){}  // we should create default constructor compile wont create implicitly 

	constructorTest1(int a, int b) {
		test_a = a;
		test_b = b;
	}

	public static void main(String args[]) {
		constructorTest1 test = new constructorTest1();
		System.out.println(test.test_a + " " + test.test_b);
	}
}
