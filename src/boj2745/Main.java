package boj2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		String s = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		long sum = 0;
		long time = 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				sum += (ch - 'A' + 10) * time;
			} else {
				sum += (ch - '0') * time;
			}
			time *= B;
		}
		System.out.println(sum);
	}
}
