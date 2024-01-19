import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<String>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (st.nextToken().equals("enter")) {
				set.add(s);
			} else {
				set.remove(s);
			}
		}
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		Collections.sort(list, Collections.reverseOrder());
		for (String a : list) {
			System.out.println(a);
		}
	}
}