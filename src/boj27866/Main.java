package boj27866;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String sin=in.readLine();
		int index = Integer.parseInt(in.readLine());
		System.out.println(sin.charAt(index-1));
	}
}
