import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static Long visited[];
	static Long Max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] N = new int[T];
		for (int i = 0; i < T; i++) {
			N[i] = (int) Integer.parseInt(br.readLine());
		}
		Max = (long) Arrays.stream(N).max().getAsInt();
		visited = new Long[(int) (Max + 1)];
		visited[1] = 1L;
		visited[2] = 1L;
		visited[3] = 1L;
		func();
		for (int i = 0; i < T; i++) {
			sb.append(String.valueOf(visited[N[i]])).append("\n");
		}
		System.out.println(sb);
	}// main

	static void func() {
		for (int i = 4; i < Max + 1; i++) {
			visited[i] = visited[i - 2] + visited[i - 3];
		}
	}
}
