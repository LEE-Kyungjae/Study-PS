import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static int cnt = 0;
	static int num;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		sb.append((int) Math.pow(2, num) - 1).append("\n");
		doit(num, 1, 2, 3);
		System.out.println(sb);
	}// main

	private static void doit(int num, int position, int mid, int to) {
		if (num == 1) {
			sb.append(position + " " + to + "\n");
			return;
		}
		doit(num - 1, position, to, mid);
		sb.append(position + " " + to + "\n");
		doit(num - 1, mid, position, to);
		;
		// sb.append
	}
}