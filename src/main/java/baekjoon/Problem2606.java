package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2606 {
    static int N;
    static int M;
    static ArrayList<Integer>[] com;
    static boolean[] visited;


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        visited = new boolean[N+1];
        com = new ArrayList[N+1];

        for (int i = 0; i < N+1; i++){
            com[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            com[a].add(b);
            com[b].add(a);
        }

        DFS(1);

        int vir = 0;
        for (boolean f : visited){
            if (f){
                vir++;
            }
        }

        System.out.println(vir - 1);

    }

    private static void DFS(int i) {

        visited[i] = true;
        for (int b : com[i]){
            if (!visited[b]){
                DFS(b);
            }
        }

    }

}
