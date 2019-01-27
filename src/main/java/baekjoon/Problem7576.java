package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem7576 {
	static int N;
	static int M;
	static int x;
	static int y;
	static int result;
	static int _x;
	static int _y;
	static int map[][];
	static boolean visited[][];
	static int dx[] = { 0, -1, 0, 1 }; // 우, 하, 좌, 상
	static int dy[] = { 1, 0, -1, 0 };

	static Queue<Integer> qx = new LinkedList<Integer>();
	static Queue<Integer> qy = new LinkedList<Integer>();

	public static void bfs() {
		
		result = 0;

		while (!qx.isEmpty() && !qy.isEmpty()) {

			x = qx.poll();
			y = qy.poll();

			visited[x][y] = true;

			for (int i = 0; i < 4; i++) {
				_x = x + dx[i];
				_y = y + dy[i];

				if (_x >= 0 && _y >= 0 && _x < M && _y < N) {
					if (map[_x][_y] == 0 && visited[_x][_y] == false) {
						qx.add(_x);
						qy.add(_y);
						visited[_x][_y] = true;
						map[_x][_y] = map[x][y] + 1;
						result = map[_x][_y];
					}
				}
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 0) {
					result = -1;
				}
			}
		}

		if (result > 0) {
			System.out.println(result - 1);
		} else {
			System.out.println(result);
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();

		map = new int[M][N];
		visited = new boolean[M][N];
		int temp;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				temp = sc.nextInt();
				map[i][j] = temp;

				if (temp == 1) { //익은토마토
					qx.add(i);
					qy.add(j);
				}
			}

		}

		bfs();

	}

}
