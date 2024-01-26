//창문 닫기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

//하나하나 구하는 방법
//		boolean[] window = new boolean[N];
//		for (int i = 1; i <= N; i++) {
//			for (int j = i; j <= N; j += i) {
//				window[j] = !window[j];
//			}
//		}
//
		int cnt = 0;
//		for (int i = 0; i < N; i++) {
//			if (window[i] == true) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);

		for (int i = 1; i * i <=N; i++) {
			cnt++;
		}
		System.out.println(cnt);

	}
}