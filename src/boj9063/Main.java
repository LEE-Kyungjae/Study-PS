package boj9063;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		int n = Integer.parseInt(in.readLine());
		int x = 0;
		int y = 0;
		int xmin = 10000;
		int xmax = -10000;
		int ymin = 10000;
		int ymax = -10000;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			xmin = Math.min(x, xmin);
			xmax = Math.max(x, xmax);
			ymin = Math.min(y, ymin);
			ymax = Math.max(y, ymax);
		}
		System.out.println((xmax - xmin) * (ymax - ymin));
	}
}
