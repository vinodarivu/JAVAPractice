package HackathonCode;

public class MagicalNumberSimpleWay {

	public static void main(String args[]) {

		getMagicalNumber(100000);

	}

	public static void getMagicalNumber(int maxNum) {

		for (int i = 1; i <= maxNum; i++) {
			int sum = 0;
			int temp = i;
			while (temp > 0) {
				if (temp > 9) {
					sum = sum + (temp % 10);
					temp = temp / 10;

				} else {
					sum = sum + temp;
					temp=0;
				}

			
			}
			if (sum == 10) {
				System.out.println(i);
			}

		}

	}
}
