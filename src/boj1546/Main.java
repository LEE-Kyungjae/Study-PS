package boj1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		double arr2[]= new double[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			arr2[i]=arr[i];
		}
		int max=Arrays.stream(arr).max().getAsInt();
		double sum=Arrays.stream(arr2).map(x->x*100/max).sum();
		System.out.println(sum/n);
		sc.close();
	}
}
