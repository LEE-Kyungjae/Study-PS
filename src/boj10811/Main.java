package boj10811;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		int[] arr = IntStream.rangeClosed(1, N).toArray();

		for (int m = 0; m < M; m++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			reverse(arr, start, end);
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	private static void reverse(int[] arr, int start, int end) {
		for (int i = 0; i < (end - start + 1) / 2; i++) {
			int temp = arr[start - 1 + i];
			arr[start - 1 + i] = arr[end - 1 - i];
			arr[end - 1 - i] = temp;
		}
	}
}