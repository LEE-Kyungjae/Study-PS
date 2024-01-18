import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Long n = Long.parseLong(in.readLine());
		System.out.println((n - 2) * (n - 1) * n / 6);
		System.out.println(3);
	}
}