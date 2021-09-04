
public class SumMultiples {

	public static void main(String[] args) {

		System.out.println(sumMultiples());
	}

	private static int sumMultiples() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0) {
				sum += i;
				continue;
			}
			if (i % 5 == 0) {
				sum += i;
				continue;
			}
			if (i % 15 == 0) {
				sum += i;
				continue;
			}
		}
		return sum;
	}

}
