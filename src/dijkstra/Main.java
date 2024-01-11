package dijkstra;

import java.util.Iterator;

public class Main {
	static int INF = 1000000000;
	int d[] = new int[6];
	boolean v[] = new boolean[6];
	int a[][] = { { 0, 2, 5, 1, INF, INF }, { 2, 0, 3, 2, INF, INF }, { 5, 3, 0, 3, 1, 5 }, { 1, 2, 3, 0, 1, INF },
			{ INF, INF, 1, 1, 0, 2 }, { INF, INF, 5, INF, 2, 0 }, };

	public static void main(String[] args) {

	}

	int getSmallIndex() {
		int min = INF;
		int index = 0;
		for (int i = 0; i < 6; i++) {
			if (d[i] < min && !v[i]) {
				min = d[i];
				index = i;
			}
		}
		return index;
	}
}
