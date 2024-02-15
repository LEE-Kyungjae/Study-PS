import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//문제
//	2의 31승 -1 시간동안 최대한 회의를 많이 진행한다했을때 몇회의를 진행할수있는가?

//입력 
//	- 첫줄 : 요청의 개수가 입력된다.
//	- 두번째줄부터 N개의 줄: 스케줄 요청(시작시간, 끝나는시간)이 입력된다.

//구상
// 1. 요청을 빨리끝나는순으로 정렬한다.
// 2. 요청을 하나씩 읽어나간다 단,시작시간으로 아직 회의가 끝나지 않았는지 확인해서 시작시간보다 먼저 끝나있다면 카운트한다.

//요구하는 사전지식
// 그리디, sort(copare)
// 
public class Main {
	static int request[][];
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// input
		int N = Integer.parseInt(br.readLine());
		request = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			request[i][0] = Integer.parseInt(st.nextToken());
			request[i][1] = Integer.parseInt(st.nextToken());
		}

		// logic

		// 1. 요청을 빨리끝나는순으로 정렬한다.
		Arrays.sort(request, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		});

		// 2. 요청을 하나씩 읽어나간다 단,시작시간으로 아직 회의가 끝나지 않았는지 확인해서 시작시간보다 먼저 끝나있다면 카운트한다.

		// 이전에 스케줄링했던 회의종료시간 임시저장
		int temp = 0;

		for (int i = 0; i < N; i++) {
			// 이전 종료시간이
			if (temp <= request[i][0]) {
				temp = request[i][1];
				cnt++;
			}
		}
		// output
		System.out.println(cnt);
	}
}// main