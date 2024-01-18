import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] arr = new char[5][15];
		String temp;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 15; j++) {
				arr[i][j] = ' ';
			}
		}
		for (int i = 0; i < 5; i++) {
			temp = in.readLine();
			for (int j = 0; j < temp.length(); j++) {
				arr[i][j] = temp.charAt(j);
			}

		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] == ' ') {
					continue;
				}
				sb.append(arr[j][i]);
			}
		}
		System.out.println(sb);
	}
}