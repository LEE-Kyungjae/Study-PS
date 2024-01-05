package boj11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());
		int sum=0;
		String str = in.readLine();
		for (int i = 0; i < a; i++) {
			sum+=Integer.parseInt(""+str.charAt(i));
		}
		System.out.println(sum);
	}
}
