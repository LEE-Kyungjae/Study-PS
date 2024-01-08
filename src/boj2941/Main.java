package boj2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		String[] prefix = { "c=", "c-", "d-", "lj", "dz=", "nj", "s=", "z=" };
		int len = str.length();
		int cnt = 0;
		String temp = "";
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < prefix.length; j++) {
				if (str.charAt(i) == prefix[j].charAt(0)) {
					temp = str.substring(i, str.length());
					if (temp.startsWith(prefix[j])) {
						cnt += prefix[j].length() - 1;
						i=i+prefix[j].length()-1;
					}
				}
			}
		}
		System.out.println(len - cnt);
	}

}
