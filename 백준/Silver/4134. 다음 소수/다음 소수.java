import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			BigInteger n = new BigInteger(String.valueOf(br.readLine()));
			if (n.isProbablePrime(10)) {
				bw.write(n + "\n");
			} else {
				bw.write(n.nextProbablePrime() + "\n");
			}

		}
		bw.flush();
		bw.close();
	}
}