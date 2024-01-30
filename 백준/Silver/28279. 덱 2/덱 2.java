import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> que = new LinkedList<Integer>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			switch (command) {
			case "1":
				que.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case "2":
				que.offerLast((Integer.parseInt(st.nextToken())));
				break;
			case "3":
				bw.write(que.isEmpty() ? -1 + "" : que.pollFirst() + "");
				bw.write("\n");
				break;
			case "4":
				bw.write(que.isEmpty() ? -1 + "" : que.pollLast() + "");
				bw.write("\n");
				break;
			case "5":
				bw.write(que.size() + "");
				bw.write("\n");
				break;
			case "6":
				bw.write(que.isEmpty() ? 1 + "" : 0 + "");
				bw.write("\n");
				break;
			case "7":
				bw.write(que.isEmpty() ? -1 + "" : que.peek() + "");
				bw.write("\n");
				break;
			case "8":
				bw.write(que.isEmpty() ? -1 + "" : que.peekLast() + "");
				bw.write("\n");
				break;

			default:
				break;
			}
		}
		bw.flush();
		bw.close();

	}
}