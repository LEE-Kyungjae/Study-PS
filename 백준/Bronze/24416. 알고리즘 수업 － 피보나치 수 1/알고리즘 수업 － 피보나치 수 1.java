import java.util.Scanner;

//피보나치 수
public class Main {
	static int f[];
	static int fun1, fun2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f = new int[n + 1];
		System.out.println(fib(n) + " " + fibonacci(n));
	}// main

	private static int fib(int n) {
		fun1++;
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	private static int fibonacci(int n) {
		f[0] = f[1] = 1;
		for (int i = 3; i <= n; i++) {
			fun2++;
			f[i] = f[i - 1] - f[i - 2];
		}
		return fun2;
	}
}
