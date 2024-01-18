import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int func() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] passpoint = new int[n];
		for (int i = 0; i < n; i++) {// 과목수 만큼 반복
			int p = sc.nextInt();// 신청자 수
			int l = sc.nextInt();// 수강가능인원
			Integer[] appliedPoint = new Integer[p];
			// 신청자수가 수강가능인원보다 적으면
			for (int j = 0; j < p; j++) {
				appliedPoint[j] = sc.nextInt();
			}
			if (p < l) {
				passpoint[i] = 1;
			} else { // 라인입력받고 배열에 집어넣기
				Arrays.sort(appliedPoint, Collections.reverseOrder());// 36 36 36 25 1
				passpoint[i] = appliedPoint[l - 1];
			}
		}
		Arrays.sort(passpoint);
		long mSum = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			mSum += passpoint[i];
			if (mSum > m) {
				break;
			}
			cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		System.out.print(func());
		return;
	}
}
