import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static int n, m;
	// n은 최대수(반복)
	// m은 깊이(개수)
	static boolean[] visit;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		// visit은 n개
		visit = new boolean[n];
		// arr은 m개
		arr = new int[m];
		dfs(0, 0);
		System.out.println(sb);
	}// main

	private static void dfs(int depth, int start) {
		//요소들 
		if (depth == m) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		} // if

		for (int i = start; i < n; i++) {
			// visit[i] 즉 n개의 visit요소들은 if문안에 들어가려면 false여야하고 한번들어가는순간 true값이 들어가므로
			//한번밖에 실행안됨. n번의 dfs가 수행된다.-> 이때 n번 실행된 각각의 dfs는 각각 dfs를 호출하는데 깊이 우선탐색을 진행
			if (!visit[i]) {
				// 조회했다고 변경
				visit[i] = true;
				// arr[depth]에 i+1값 입력
				arr[depth] = i + 1;
				// 재귀 arr를 n 만큼 호출함
				dfs(depth + 1, i + 1);
				
				visit[i] = false;
			}
		}

	}// func
}