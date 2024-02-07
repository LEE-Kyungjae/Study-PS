import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static int cnt;
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dfs(0);
		System.out.println(cnt);
	}// main

	private static void dfs(int depth) {
		if (depth == N) {
			cnt++;
			return;
		}
		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			if (possibility(depth)) {
				dfs(depth + 1);
			}
		}
	}

	private static boolean possibility(int depth) {
		for (int i = 0; i < depth; i++) {
			if (arr[depth] == arr[i]) {
				return false;
			} else if (Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) {
				// 대각선일경우
				return false;
			}
		}
		return true;
	}
}
