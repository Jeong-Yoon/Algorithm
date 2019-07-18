package baekjoon;

/*
 * 소수 찾기
 */
import java.util.Scanner;

public class Problem1978 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = N;

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num == 1) {
				answer--;
			}
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					answer--;
					break;
				}
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
