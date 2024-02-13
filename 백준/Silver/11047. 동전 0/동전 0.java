import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int coin = 0;
		int temp = 0;
		int K = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int j = N - 1; j >= 0; j--) {
			temp = K / arr[j];
			if (temp > 0) {
				coin += K / arr[j];
				K -= arr[j] * temp;
			}
		}
		System.out.println(coin);
	}// main
}
