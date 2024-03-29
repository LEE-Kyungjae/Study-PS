package boj2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(in.readLine());
		int N = Integer.parseInt(in.readLine());
		int min = N;
		// M<=N
		int sum = 0;
		out: for (int i = M; i <= N; i++) {
			if (i == 1) {
				continue;
			}
			for (int j = 2; j <= (i + 1) / 2; j++) {
				if (i % j == 0) {
					continue out;
				}
			}
			sum += i;
			if (min > i) {
				min = i;
			}
		}
		if (sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println(-1);

		}
	}
}
