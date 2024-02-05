import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] A;
	static int[] tmp;
	static int cnt = 0;
	static int K;
	static int result = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		tmp = new int[N];
		merge_sort(0, N - 1);
		System.out.println(result);
	}

	private static void merge_sort(int start, int end) {
		if (cnt > K) {
			return;
		}
		if (start < end) {
			int middle = (start + end) / 2;
			merge_sort(start, middle);
			merge_sort(middle + 1, end);
			merge(start, middle, end);
		}
	}

	private static void merge(int start, int middle, int end) {
		int i = start;
		int j = middle + 1;
		int t = 0;
		while (i <= middle && j <= end) {
			if (A[i] <= A[j]) {
				tmp[t] = A[i];
				i++;
			} else {
				tmp[t] = A[j];
				j++;
			}
			t++;
		}
		while (i <= middle) {
			tmp[t++] = A[i++];
		}
		while (j <= end) {
			tmp[t++] = A[j++];
		}
		i = start;
		t = 0;
		while (i <= end) {
			cnt++;
			if (cnt == K) {
				result = tmp[t];
				break;
			}
			A[i++] = tmp[t++];
		}
	}
}
