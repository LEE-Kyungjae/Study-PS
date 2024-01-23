import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Long A = Long.parseLong(st.nextToken());
		Long B = Long.parseLong(st.nextToken());
		Long max = Math.max(A, B);
		for (Long j = max; j <= A * B; j += max) {
			if (j % A + j % B == 0) {
				bw.write(j + "\n");
				break;
			}
		}

		bw.flush();
		bw.close();
	}
}
