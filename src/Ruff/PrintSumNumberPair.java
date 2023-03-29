package Ruff;

public class PrintSumNumberPair {

	public static void main(String args[]) {
		printPairs(35l);

	}

	public static void printPairs(Long val) {
		for (Long i = 1l; i < val; i++) {
			if (i < val/2l) {
				System.out.println("(" + (val - i) + "," + i + ")");
			}
		}
	}

}
