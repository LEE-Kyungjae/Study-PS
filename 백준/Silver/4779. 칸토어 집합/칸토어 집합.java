import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean[] str;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		while ((input = br.readLine()) != null) {
			int a = Integer.parseInt(input);
			int calc = (int) Math.pow(3, a);
			str = new boolean[calc];

			kantor(0, calc - 1);
			for (int i = 0; i < calc; i++) {
				if (str[i] == false) {
					sb.append("-");
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
			;
		}
		System.out.println(sb);
	}

	private static void kantor(int start, int end) {

		int length = (end - start + 1) / 3;

		if (length < 1) {
			return;
		}
		for (int i = start + length; i < start + length + length; i++) {
			if (str[i] == false) {
				str[i] = true;
			}
		}
		kantor(start, start + length - 1);
		kantor(start + length + length, start + length + length + length + -1);
	}
}