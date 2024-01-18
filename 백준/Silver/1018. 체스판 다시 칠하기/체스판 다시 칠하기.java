import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	final static char[][] whitef = {
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'}
	};
	final static char[][] blackf = {
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'}
	};
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		char[][] s = new char[N][M];
		for (int i = 0; i < N; i++) {
			s[i] = in.readLine().toCharArray();
		}
		int fixnum = Integer.MAX_VALUE;
		for (int i = 0; i <= N-8; i++) {
			for (int j = 0; j <= M-8; j++) {
				int whiteb=0;
				int blackb=0;
				for (int k = 0; k < 8; k++) {
					for (int k2 = 0; k2 < 8; k2++) {
						final char c = s[k+i][k2+j];
						if(c!=whitef[k][k2]) {
							whiteb++;
						}
						if(c!=blackf[k][k2]) {
							blackb++;
						}
					}
				}
				fixnum = Math.min(fixnum, Math.min(whiteb, blackb));
			}
		}
		System.out.println(fixnum);
	}
}



