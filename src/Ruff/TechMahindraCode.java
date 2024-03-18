package Ruff;

public class TechMahindraCode {

	public static void main(String[] args) {
		System.out.println("Perfect numbers between 1 and 100:");
		for (int i = 1; i <= 1000000; i++) {
			if (isPerfectNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPerfectNumber(int num) {
		if (num <= 1) {
			return false;
		}

		int sum = 1;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				sum += i;
				if (i != num / i) {
					sum += num / i;
				}
			}
		}

		return sum == num;
	}
}
