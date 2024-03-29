package boj2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//반례 찾아야함
public class Main_err {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// 자연수 in
		String N = in.readLine();
		// int 값으로 변경
		int n = Integer.parseInt(N);
		String s = "";
		// 완전탐색
		for (int i = 0; i < n; i++) {
			Long sum = 0L;
			// 몇자리인지 구하는 로직
			int length = (int) (Math.log10(i) + 1);
			sum += i;
			for (int j = 0; j < length; j++) {
				sum += Integer.toString(i).charAt(j) - '0';
				// 생성자 판단조건
				if (n == sum) {
					System.out.println(i);
					return;
				}

			}
		}
		System.out.println(0);
	}
}
