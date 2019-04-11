package baekjoon;

import java.io.IOException;
        import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;

public class Problem2178 {
    static int N;
    static int M;
    static int x;
    static int y;
    static int _x;
    static int _y;
    static int map[][];
    static boolean visited[][];
    static int dx[] = {-1, 0, 1, 0}; // 좌, 하, 우, 상
    static int dy[] = {0, -1, 0, 1};

    static Queue<Integer> qx = new LinkedList<Integer>();
    static Queue<Integer> qy = new LinkedList<Integer>();

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++){
            String temp = sc.nextLine();
            for (int j = 0; j < M; j++){
                map[i][j] = temp.charAt(j) - '0';
                visited[i][j] = false;
            }
        }

        visited[0][0] = true;

        bfs(0,0);
        System.out.println(map[N - 1][M - 1]);
    }

    public static void bfs(int x, int y){
        qx.add(x);
        qy.add(y);

        while (!qx.isEmpty() && !qy.isEmpty()) {
            x = qx.poll();
            y = qy.poll();

            for (int i = 0; i < 4; i++){
                _x = x + dx[i];
                _y = y + dy[i];

                if (_x >= 0 && _y >= 0 && _x < N && _y < M){
                    if (map[_x][_y] == 1 && !visited[_x][_y]){
                        qx.add(_x);
                        qy.add(_y);
                        map[_x][_y] = map[x][y] + 1;
                        visited[_x][_y] = true;
                    }
                }
            }
        }

    }
}
