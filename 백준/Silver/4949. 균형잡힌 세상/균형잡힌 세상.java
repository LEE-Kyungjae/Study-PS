import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean b = false;
		out: while (true) {
			String a = br.readLine();
			if (a.charAt(0) == '.') {
				break;
			}
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < a.length(); i++) {
				char input = a.charAt(i);

				if (input == '[' || input == '(') {
					stack.push(input);
				} else if (input == ']') {
					if (stack.empty() || stack.peek() != '[') {
						System.out.println("no");
						continue out;
					} else {
						stack.pop();
					}
				} else if (input == ')') {
					if (stack.empty() || stack.peek() != '(') {
						System.out.println("no");
						continue out;
					} else {
						stack.pop();
					}
				}

			}
			if (stack.empty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		br.close();
	}
}