package baekjoon;

import java.util.*;

public class Problem16236 {

    static int N;
    static int[][] map;
    static int size = 2;
    static int time = 0;
    static int cnt = 0;
    static int big_cnt = 0;
    static int a;
    static int b;
    static int x;
    static int y;
    static int _x;
    static int _y;
    static int dx[] = {0, -1, 0, 1}; // 우, 하, 좌, 상
    static int dy[] = {1, 0, -1, 0};

    static Queue<Dot> dot = new LinkedList<>();
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        map = new int[N][N];

        for(int i = 0; i < N; i++){
            String[] temp = sc.nextLine().split(" ");
            for (int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(temp[j]);
                if (Integer.parseInt(temp[j]) == 9){
                    x = i;
                    y = j;
                    a = i;
                    b = j;
                    dot.add(new Dot(i,j));
                }
            }
        }

        solution(x,y);
        System.out.println(time);

    }

    public static void solution(int x, int y){

        while (dot.size() < N*N && big_cnt < 3){
            big_cnt = 0;
            for (int i = 0; i < 4; i++){
                _x = x + dx[i];
                _y = y + dy[i];

                if (_x >= 0 && _y >= 0 && _x < N && _y < N){
                    if (map[_x][_y] != 0 && map[_x][_y] < size){
                        map[_x][_y] = 0;
                        x = _x;
                        y = _y;
                        size++;
                        time += Math.abs(a-x) + Math.abs(b-y);
                        time += cnt;
                        cnt = 0;
                        a = x;
                        b = y;
                        dot.add(new Dot(_x,_y));
                    } else if(map[_x][_y] == 0){
                        x = _x;
                        y = _y;
                        dot.add(new Dot(_x,_y));
                        cnt++;
                    } else if(map[_x][_y] == size){
                        x = _x;
                        y = _y;
                    } else{
                        big_cnt++;
                        continue;
                    }
                }
            }
        }
    }

    static class Dot{
        int x;
        int y;

        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
