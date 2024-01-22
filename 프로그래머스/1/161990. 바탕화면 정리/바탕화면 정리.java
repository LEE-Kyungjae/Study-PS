import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
	public int[] solution(String[] wallpaper) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lux = Integer.MAX_VALUE;
		int luy = Integer.MAX_VALUE;
		int rdx = 0;
		int rdy = 0;
		char[][] a = new char[50][50];
		int n = wallpaper.length;
		int m = wallpaper[0].length();
		for (int i = 0; i < n; i++) {
			a[i] = wallpaper[i].toCharArray();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == '#') {
					if (i < lux) {
						lux = i;
					}
					if (i > rdx) {
						rdx = i;
					}
					if (j < luy) {
						luy = j;
					}
					if (j > rdy) {
						rdy = j;
					}
				}
			}
		}

		int[] answer = new int[4];
		answer[0] = lux;
		answer[1] = luy;
		answer[2] = rdx + 1;
		answer[3] = rdy + 1;
		return answer;
	}
}