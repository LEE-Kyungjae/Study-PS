import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

//요세푸스
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> que = new LinkedList<Integer>();
		IntStream.range(1, N + 1).forEach(x -> que.add(x));
		bw.write("<");
		while (que.size() > 1) {
			for (int i = 0; i < K - 1; i++) {
				que.add((int) que.poll());
			}
			bw.write((int) que.poll() + "");
			bw.write(", ");
		}
		bw.write((int) que.poll() + "");
		bw.write(">");
		bw.flush();
		bw.close();
	}
}
