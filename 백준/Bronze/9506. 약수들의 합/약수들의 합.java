import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		int n = 0;
		int result = 0;
		while (true) {
			n = Integer.parseInt(in.readLine());
			sb = new StringBuilder();
			result = 1;
			if (n == -1) {
				break;
			}
			sb.append(n + " = 1");
			for (int i = 2; i <= (n + 1) / 2; i++) {
				if (n % i == 0) {
					result += i;
					sb.append(" + " + i);
				}
			}
			if (result == n) {
				System.out.println(sb);
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
}