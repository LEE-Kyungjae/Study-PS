import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제번호: 14503
public class Main {
    static int N, M;
    static int[][] room;
    static boolean cleaned[][];
    //x좌표 이동
    static int[] dx = {-1, 0, 1, 0};
    //y좌표 이동
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        //1. 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int direction = Integer.parseInt(st.nextToken());

        room = new int[N][M];
        cleaned = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cleanedCount = cleanRoom(r, c, direction);

        System.out.println(cleanedCount);
    }

    static int cleanRoom(int r, int c, int direction) {
        int count = 0;
        if (cleaned[r][c]){

        }
        while (true) {
            //1. 현재 위치 청소
            if (!cleaned[r][c]) {
                cleaned[r][c] = true;
                count++;
            }
            boolean moved = false;

            //2. 반시계 방향으로 4 방향 탐색
            for (int i = 0; i < 4; i++) {
                direction = (direction + 3) % 4;
                int nx = r + dx[direction];
                int ny = c + dy[direction];
                if (room[nx][ny] == 0 && !cleaned[nx][ny]) {
                    r = nx;
                    c = ny;
                    moved = true;
                    break;
                }
            }

            //3. 이동하지 못했으면 후진 시도, 후진실패시 break
            if (!moved) {
                int backDir = (direction + 2) % 4;
                int backX = r + dx[backDir];
                int backY = c + dy[backDir];
                if (room[backX][backY] == 1) break;

                r = backX;
                c = backY;
            }
        }
        return count;
    }
}