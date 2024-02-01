import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		System.out.println(fac(N));

	}

	private static Long fac(Long N) {
		if (N == 0) {
			return 1L;
		}
		return N * fac(N - 1);
	}
}
