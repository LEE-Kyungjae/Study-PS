import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		//int n = Integer.parseInt(in.readLine());
		int sum = 0;
		int a = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			a = Integer.parseInt(in.readLine());
			sum += a;
			list.add(a);
		}
		Collections.sort(list);
		System.out.println(sum/5);
		System.out.println(list.get(2));
	}
}