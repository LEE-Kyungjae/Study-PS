import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//재귀함수가 호출될때 호출되는 부분은 N/3이다.
// 호출값이 length로 지정되며, 해당값으로 분할되어 출력된다.

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][N];

		// 공백으로 초기화
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = " ";
			}
		}
		star(arr, 0, 0, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.write(String.valueOf(arr[i][j]));
			}
			bw.write(String.valueOf("\n"));
		}
		bw.flush();
		bw.close();
	}// main

	private static void star(String[][] arr, int x, int y, int n) {
		if (n == 1) {
			arr[x][y] = "*";
			return;
		}
		// 가로 세로 3등분
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!(i == 1 && j == 1)) {
					star(arr, x + i * (n / 3), y + j * (n / 3), n / 3);
				}
			}
		}
	}
}