package baekjoon;
/*
동전0
 */
import java.util.Scanner;

public class Problem11047 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = 0;

        for (int i = N - 1; i >= 0; i--) {
            int cnt = K / arr[i];
            answer += K / arr[i];
            K %= arr[i];
        }

        System.out.println(answer);
    }
}
