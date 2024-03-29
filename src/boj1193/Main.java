package boj1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Long X = Long.parseLong(in.readLine()) - 1;
		int top = 1;
		int btm = 1;
		if (X >= 1) {
			btm++;
			X--;
		}

		out: while (X > 0) {
			if (top == 1) {
				while (btm > 1) {
					top++;
					btm--;
					X--;
					if (X == 0) {
						continue out;
					}
				}
			} else if (btm == 1) {
				while (top > 1) {
					top--;
					btm++;
					X--;
					if (X == 0) {
						continue out;
					}
				}
			}
			if (btm > top) {
				btm++;
			} else {
				top++;
			}
			X--;

		}
		System.out.println(top + "/" + btm);

	}
}
