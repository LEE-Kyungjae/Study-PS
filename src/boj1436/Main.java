package boj1436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int cnt = 0;
		out:for (int i = 665; i <= Integer.MAX_VALUE; i++) {
			if (cnt == n) {
				System.out.println(i-1);
				return;
			}
			String s = "" + i;
			int stack = 0;
			// 한숫자에 대해서
			for (int j = 0; j < Math.log10(i) - 2; j++) {
				if (s.charAt(j) == '6') {
					if (s.charAt(j + 1) == '6') {
						if (s.charAt(j + 2) == '6') {
							cnt++;
							continue out;
						}
					}
				}

			}
		}

	}
}