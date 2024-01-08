package boj10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int str_len = str.length();
		int[] out = new int[26];
		Arrays.fill(out, -1);
		for (int i = 0; i < str_len; i++) {
			if (out[str.charAt(i) - 'a'] == -1) {
				out[str.charAt(i) - 'a'] = i;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(out[i] + " ");
		}
	}
}
