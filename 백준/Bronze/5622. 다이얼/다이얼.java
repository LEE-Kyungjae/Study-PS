import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int i = 0;
		int count = 0;
		while (i < str.length()) {
			switch (str.charAt(i)) {
			case 'A':
			case 'B':
			case 'C':
				count += 2;
				break;

			case 'D':
			case 'E':
			case 'F':
				count += 3;
				break;
			case 'G':
			case 'H':
			case 'I':
				count += 4;
				break;
			case 'J':
			case 'K':
			case 'L':
				count += 5;
				break;
			case 'M':
			case 'N':
			case 'O':
				count += 6;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				count += 7;
				break;
			case 'T':
			case 'U':
			case 'V':
				count += 8;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				count += 9;
				break;
			default:
				break;
			}
			i++;
		}
		System.out.println(count+str.length());
	}
}
