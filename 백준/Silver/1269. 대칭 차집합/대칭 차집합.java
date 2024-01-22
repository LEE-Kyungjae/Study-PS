import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			b.add(Integer.parseInt(st.nextToken()));
		}
		int sum = (int) a.stream().filter(x -> !b.contains(x)).count();
		sum += (int) b.stream().filter(x -> !a.contains(x)).count();
		System.out.println(sum);
	}
}