import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		StringTokenizer st;
		int arr[][] = new int[100][100];
		int sq[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			sq[i][0] = Integer.parseInt(st.nextToken());
			
			sq[i][1] = Integer.parseInt(st.nextToken());
		}
		int xend=0;
		int yend=0;
		for (int i = 0; i < N; i++) {
			xend=sq[i][0]+10;
			yend=sq[i][1]+10;
			for (int x = sq[i][0]; x < xend; x++) {
				for (int y = sq[i][1]; y < yend; y++) {
					arr[x][y] = 1;
				}
			}
		}
		int sum=0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
		

	}
}