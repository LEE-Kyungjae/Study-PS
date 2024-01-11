package boj5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		while (A != 0) {
			if (A < B && B % A == 0) {
				sb.append("factor\n");
			} else if (A > B && A % B == 0) {
				sb.append("multiple\n");
			} else
				sb.append("neither\n");
			st = new StringTokenizer(in.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
		}
		System.out.println(sb);
	}
}