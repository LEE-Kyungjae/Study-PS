package boj28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		int C = 0;// �Ž����� cent
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			sb = new StringBuilder();
			C = Integer.parseInt(in.readLine());
			sb.append(C / 25).append(" ");
			sb.append(C % 25 / 10).append(" ");
			sb.append(C % 25 % 10 / 5).append(" ");
			sb.append(C % 25 % 10 % 5).append("\n");
			System.out.print(sb);
		}
	}
}