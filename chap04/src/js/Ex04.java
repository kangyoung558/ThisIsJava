package js;

public class Ex04 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		while (true) {
			++num;

			if (num % 2 == 0) {
				sum -= num;
			} else {
				sum += num;
			}
			if (sum >= 100) {
				break;
			}
		}
		System.out.println(num);
	}
}
