package boj2903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int dot = 2;
		int result = 0;
		for (int i = 0; i < N; i++) {
			dot = dot*2-1;
		}
		System.out.println((int)Math.pow(dot,2));
	}
}
