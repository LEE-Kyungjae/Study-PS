import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int dp[][][] = new int[21][21][21];
	static int result = -1;
	static int a = -1;
	static int b = -1;
	static int c = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			result = w(a, b, c);
			sb.append("w(").append(a + ", ").append(b + ", ").append(c + ") = ").append(String.valueOf(result))
					.append("\n");
		}
		System.out.println(sb);
	}// main
	private static int w(int a, int b, int c) {
		if (inRange(a, b, c) && dp[a][b][c] != 0) {
			return dp[a][b][c];
		} else if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		} else if (a > 20 || b > 20 || c > 20) {
			return 1048576;
		} else if (a < b && b < c) {
			// System.out.println("root1 : a = " + a + " b = " + b + " c = " + c);
			return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		} else if (a == b && b == c) {
			return (int) Math.pow(2, a);
		} else {
			// System.out.println("root2 : a = " + a + " b = " + b + " c = " + c);
			return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
		}
	}
	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}
}