import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		char[] s = in.readLine().toCharArray();
		Integer[] k = new Integer[s.length];
		for (int i = 0; i < s.length; i++) {
			k[i] = s[i] - '0';
		}
		Arrays.sort(k, Collections.reverseOrder());
		for (int i : k) {
			System.out.print(i);
		}
	}
}
