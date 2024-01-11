package boj2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		Long V = Long.parseLong(st.nextToken());
		Long last = V - A;
		Long midcnt = last / (A - B);
		Long left = last % (A - B);
		// last = (midcnt * (A-B)) + left;
		Long midmiter = midcnt * (A - B);
		while (true) {
			midmiter += A;
			midcnt++;
			if (V <= midmiter) {
				break;
			}
			midmiter -= B;

		}
		System.out.println(midcnt);
	}
}