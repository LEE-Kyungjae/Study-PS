package boj1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_speed_solve {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		double max = 0;
		double[] arr = new double[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		
			if(max<arr[i]) max=arr[i];
		}
		for (int i = 0; i < n; i++) {
			arr[i]=arr[i]/max*100;
		}
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum+= arr[i];
		}
		
		System.out.println(sum/n);
		
	}
}
