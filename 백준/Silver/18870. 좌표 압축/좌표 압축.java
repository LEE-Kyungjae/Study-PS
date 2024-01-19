import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//좌표압축
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int[] rank = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			rank[i] = arr[i];
		}
		Arrays.sort(rank);
		for (int i = 0; i < arr.length; i++) {
			if (map.get(rank[i]) == null) {
				map.put(rank[i], cnt++);
			}
		}
		for (int j = 0; j < N; j++) {
			sb.append(map.get(arr[j])).append(" ");
		}
		System.out.println(sb);
	}
}