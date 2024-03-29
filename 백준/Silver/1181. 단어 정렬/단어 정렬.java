import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		// 정렬
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else
					return o1.length() - o2.length();
			}
		});
		// 중복제거
		for (int i = 0; i < N; i++) {
			if (i != 0) {
				if (arr[i].compareTo(arr[i - 1]) != 0) {
					sb.append(arr[i]).append("\n");
				}
			} else {
				sb.append(arr[i]).append("\n");
			}
		}
		System.out.println(sb);
	}
}