import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int i = 0;
		int j = 0;
		int k = 0;
		int max = 0;
		int temp = 0;
		for (i = 0; i < arr.length - 2; i++) {
			for (j = i + 1; j < arr.length -1; j++) {
				for (k = j + 1; k < arr.length; k++) {
					//System.out.println(i + " " + j + " " + k);
					temp = arr[i] + arr[j] + arr[k];
					if (max < temp && temp <= m) {
						max = temp;
					}
				}
			}
		}
		System.out.println(max);
	}
}
