package boj2839;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		int N = Integer.parseInt(in.readLine());
		int cnt = 0;
		int k5 = 0;
		int k3 = 0;
		int left = 0;
		k5 = N / 5;
		k3 = (N % 5) / 3;
		left = (N % 5) % 3;
		while (left % 3 != 0 && k5 > 0) {
			k5--;
			left += 5;
			k3 += left / 3;
			left = left % 3;
		}
		if (left == 0) {
			System.out.println(k5 + k3);
		} else {
			System.out.println(-1);
		}
	}
}
