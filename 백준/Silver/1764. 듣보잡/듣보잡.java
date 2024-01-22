import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long N = Long.parseLong(st.nextToken());
		Long M = Long.parseLong(st.nextToken());
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		Long cnt = 0L;
		for (int i = 0; i < N; i++) {
			String key = br.readLine();
			set.add(key);
		}
		for (int i = 0; i < M; i++) {
			String key = br.readLine();
			if (set.contains(key)) {
				list.add(key);
				cnt++;
			}
		}
		System.out.println(cnt);
		list.stream().sorted().forEach(System.out::println);
	}
}