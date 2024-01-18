
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] arr = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < input; i++) {
			if (num == arr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}