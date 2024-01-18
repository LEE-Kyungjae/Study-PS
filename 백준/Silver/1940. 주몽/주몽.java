import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//투포인트 갑옷문제
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A.length; i++) {
			A[i]= Integer.parseInt(st.nextToken());
			
		}
		Arrays.sort(A);
		int count = 0;
		int i = 0;//A[0] min값
		int j = n-1;//A[N-1]
		while (i<j) {
			if(A[i]+A[j]<m)i++;
			else if(A[i]+A[j]>m)j--;
			else {
				count++;
				i++;j--;
			}
		}
		System.out.println(count);
	}
}