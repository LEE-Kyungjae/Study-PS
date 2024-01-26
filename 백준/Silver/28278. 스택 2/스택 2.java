import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 명령어의 수
		while (N-- > 0) {
			String a = br.readLine();
			switch (a.charAt(0)) {
			case '1':
				stack.push(Integer.parseInt(a.substring(2)));
				break;
			case '2':
				sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
				break;
			case '3':
				sb.append(stack.size()).append("\n");
				break;
			case '4':
				sb.append(stack.isEmpty() ? 1 : 0).append("\n");
				break;
			case '5':
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
				break;
			default:
				break;
			}
		}
		System.out.println(sb);
	}
}