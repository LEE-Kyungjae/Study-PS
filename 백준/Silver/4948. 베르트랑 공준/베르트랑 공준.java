import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static boolean[] primeNumber = new boolean[246913];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		countPrime();
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			int cnt = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (!primeNumber[i])
					cnt++;
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
		bw.close();
		return;
	}

	private static void countPrime() {
		primeNumber[0] = primeNumber[1] = true;
		for (int i = 2; i < Math.sqrt(primeNumber.length); i++) {
			if (primeNumber[i])
				continue;
			for (int j = i * i; j < primeNumber.length; j += i) {
				primeNumber[j] = true;
			}
		}
	}
}