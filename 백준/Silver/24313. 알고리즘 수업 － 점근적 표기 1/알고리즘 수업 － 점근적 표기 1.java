import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());

		int c = Integer.parseInt(in.readLine());
		int n0 = Integer.parseInt(in.readLine());
		if (a1 * n0 + a0 <= c * n0 && c >= a1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
}