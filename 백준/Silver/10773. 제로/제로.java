import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		while (K-- > 0) {
			int a = Integer.parseInt(br.readLine());
			if (a == 0) {
				stack.pop();
			} else {
				stack.push(a);
			}
		}
		System.out.println(stack.stream().reduce(0, Integer::sum));
	}
}
