package boj1427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_other_sol {
	private static int min;
	private static int tmp;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int size = input.length();
		int[] num = new int[size];
		br.close();
		for (int i = 0; i < size; i++) {
			num[i] = (int) input.charAt(i) - 48;
		}
		for (int i = 0; i < num.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					min = j;
					tmp = num[min];
					num[min] = num[i];
					num[i] = tmp;
				}
			}

		}
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i]);
		}

	}
}
