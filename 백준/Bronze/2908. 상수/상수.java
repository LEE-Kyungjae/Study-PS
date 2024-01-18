import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		String a = st.nextToken();
		String b = st.nextToken();
		boolean jug;
		int i = 2;
		while (i >= 0) {

			if (Integer.parseInt("" + a.charAt(i)) == Integer.parseInt("" + b.charAt(i))) {
				i--;
				continue;
			}
			if (Integer.parseInt("" + a.charAt(i)) > Integer.parseInt("" + b.charAt(i))) {
				print(a);
				return;
			} else {
				print(b);
				return;
			}
		}

	}
	static void print(String p) {
		for (int i = p.length()-1; i >= 0; i--) {
			System.out.print(p.charAt(i));
		}
	}
}