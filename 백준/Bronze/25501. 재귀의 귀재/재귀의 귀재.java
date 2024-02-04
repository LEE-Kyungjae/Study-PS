import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			sb.append(isPalindrome(str) + "").append(" ").append(cnt + "\n");
			cnt = 0;
		}
		System.out.println(sb);
		br.close();
	}

	private static int isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		return recursion(str, start, end);
	}

	private static int recursion(String str, int start, int end) {
		++cnt;
		if (start >= end)
			return 1;
		else if (str.charAt(start) != str.charAt(end)) {
			return 0;
		} else {
			return recursion(str, start + 1, end - 1);
		}
	}
}
