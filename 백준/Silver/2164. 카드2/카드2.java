import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.IntStream;

public final class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new ArrayDeque<Integer>();
		IntStream.range(1, N + 1).forEach(x -> deq.add(x));
		// deq.stream().forEach(x -> System.out.println(x));
		while (deq.size() > 1) {
			deq.pop();
			deq.addLast(deq.pop());
		}
		System.out.println(deq.peek());
	}
}
