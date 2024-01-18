import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		StringBuilder sb = new StringBuilder();

		long N = Long.parseLong(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		String str = "";
		while (N > 0) {
			int num = (int) (N % B);
			if (num >= 10) {
				str += ((char) (num + 'A' - 10));
			} else{
				str += ((char) (num + '0'));
			}
			N /= B;
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}
}
