package boj3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] def = { 1, 1, 2, 2, 2, 8 };
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int[] input = new int[6];
		for (int i = 0; i < 6; i++) {
			sb.append(def[i]-Integer.parseInt(st.nextToken())+" ");
		}
		System.out.println(sb);
	}
}

