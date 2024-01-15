package eratosthenes;

public class Main {
	public static void main(String[] args) {
		int num[] = new int[2147];
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}

		for (int i = 2; i < num.length; i++) {
			if (num[i] == 0)
				continue;
			System.out.println(num[i]);
			for (int j = i * 2; j < num.length; j += i) {
				num[j] = 0;
			}
		}

	}
}
