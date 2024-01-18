import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(in.readLine());
		String str;
		for (int i = 0; i < t; i++) {
			str = in.readLine();
			sb.append(str.charAt(0)+"" + str.charAt(str.length() - 1) + "\n");
		}
		System.out.println(sb);
	}
}
