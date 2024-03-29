import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		Long sum = 1L;
		int point=6;
		int layer = 0;
		while (N > sum) {
			sum+=point*layer;
			layer++;
		}
		if(N<=1) {
			layer=1;
		}
		System.out.println(layer);
	}
}
