import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Deque<Balloon> deq = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] balloonLocation = new int[N];
		for (int i = 0; i < N; i++) {
			balloonLocation[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		sb.append("1 ");
		int moveValue = balloonLocation[0];
		for (int i = 1; i < N; i++) {
			deq.add(new Balloon(i + 1, balloonLocation[i]));
		}

		while (!deq.isEmpty()) {
			if (moveValue > 0) {
				for (int i = 1; i < moveValue; i++) {
					deq.add(deq.poll());
				}
				Balloon next = deq.poll();
				moveValue = next.numValue;
				sb.append(next.index + " ");
			} else {
				for (int i = 1; i < -moveValue; i++) {
					deq.addFirst(deq.pollLast());
				}
				Balloon next = deq.pollLast();
				moveValue = next.numValue;
				sb.append(next.index + " ");

			}
		}
		System.out.println(sb);
	}
}

class Balloon {
	int index;
	int numValue;

	public Balloon(int index, int numValue) {
		this.index = index;
		this.numValue = numValue;
	}
}