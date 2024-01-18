import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		int N = Integer.parseInt(in.readLine());
		int i = 2;
		while (N != 1) {
			if (N % i == 0) {
				System.out.println(i);
				N /= i;
				i = 1;
			}
			i++;

		}
	}
}