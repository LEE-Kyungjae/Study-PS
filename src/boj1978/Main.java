package boj1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(in.readLine());
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(in.readLine());
		for (int i = 0; i < N; i++) {
			if (isSosu(Integer.parseInt(st.nextToken()))) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	static boolean isSosu(int num) {
		int cnt = 0;
		if (num == 1) {
			return false;
		}
		for (int i = 2; i <= (num + 1) / 2; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}
		if (cnt == 0) {
			return true;
		} else {
			return false;
		}
	}
}
