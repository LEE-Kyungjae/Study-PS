import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//골드바흐 파티션
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		// 에라토스테네스 알고리즘
		boolean[] num = new boolean[1000001];
		num[0] = num[1] = true;
		for (int i = 0; i < 1000000; i++) {
			if (!num[i]) {
				for (int j = i + i; j < 1000001; j += i) {
					num[j] = true;
				}
			}
		}

		while (T-- > 0) {
			int temp = Integer.parseInt(br.readLine());
			int result = 0;
			for (int i = 0; i <= temp / 2; i++) {
				if (!num[i] && !num[temp - i]) {
					result++;
				}
			}
			System.out.println(result);
		}

	}
}