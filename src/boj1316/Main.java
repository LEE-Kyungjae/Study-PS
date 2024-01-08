package boj1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = in.readLine();
		}
		int cnt = N;
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < N; i++) {
			set = new HashSet<Character>();
			for (int j = 1; j < str[i].length(); j++) {
				if (str[i].charAt(j - 1) != str[i].charAt(j)) {
					set.add(str[i].charAt(j - 1));
				}
				if (set.contains(str[i].charAt(j))) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
