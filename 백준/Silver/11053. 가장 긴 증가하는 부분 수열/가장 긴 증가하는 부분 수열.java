import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//dp bottom-up
public class Main {
	static int arr[];
	static int dp[];
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int result = 1;
		dp[0] = 1;
		for (int i = 0; i < N; i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i] && dp[j] > max)
					max = dp[j];
			}
			dp[i] = max + 1;
			result = Math.max(result, dp[i]);
		}
		System.out.println(result);

	}// main
}