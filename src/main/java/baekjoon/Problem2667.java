package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2667 {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int cnt;
    static ArrayList<Integer> list;
    static int x;
    static int y;
    static int _x;
    static int _y;
    static int result;
    static int dx[] = {0, -1, 0, 1}; // 우, 하, 좌, 상
    static int dy[] = {1, 0, -1, 0};

    static Queue<Integer> qx = new LinkedList<>();
    static Queue<Integer> qy = new LinkedList<>();


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++){
            String temp = sc.nextLine();
            for (int j = 0; j < N; j++){
                map[i][j] = temp.charAt(j) - '0';
                visited[i][j] = false;

                if (temp.charAt(j) - '0' == 1){
                    qx.add(i);
                    qy.add(j);
                }
            }
        }

        BFS();
        System.out.println(list.size());
        for (int i : list){
            System.out.println(i);
        }
    }

    public static void BFS(){
        list = new ArrayList<>();

        while (!qx.isEmpty() && !qy.isEmpty()){
            x = qx.poll();
            y = qy.poll();
            visited[x][y] = true;

            for (int i = 0; i < 4; i++){
                _x = x + dx[i];
                _y = y + dy[i];

                if (_x >= 0 && _y >= 0 && _x < N && _y < N) {
                    if (map[_x][_y] == 0 && visited[_x][_y] == false) {
                        qx.add(_x);
                        qy.add(_y);
                        visited[_x][_y] = true;
                        map[_x][_y] = map[x][y] + 1;
                        result = map[_x][_y];
                    }
                }
            }
            list.add(result);
            result = 0;
        }
    }
}
