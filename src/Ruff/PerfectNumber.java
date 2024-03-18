package Ruff;

public class PerfectNumber {

	public static void main(String args[]) {
		getPerfectNumber(1, 100);

	}

	public static void getPerfectNumber(int min, int max) {
         
		if (min < 1) {
			System.out.println("");
		} else {
			for (int i = min; i <= max; i++) {
				int sum=0;
				for (int j = 1; j < i; j++) {
					if(i%j==0 && i!=j) {
						sum =sum+j;
					}
				}
				if(sum==i) {
					System.out.println(i);
				}
			}
		}

	}

}
