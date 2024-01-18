import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(in.readLine());
		int a= 0;
		String[] s= new String[t];
		String result[]= new String[t];
		Arrays.fill(result, "");
		for (int i = 0; i < t; i++) {
			StringTokenizer st= new StringTokenizer(in.readLine()," ");
			a=Integer.parseInt(st.nextToken());
			s[i]=st.nextToken();
			for (int j = 0; j < s[i].length(); j++) {
				for (int k = 0; k < a; k++) {
					result[i]+=s[i].charAt(j);
				}
			}
		}
		for (int j = 0; j < result.length; j++) {
			System.out.println(result[j]);
		}
	}
}
