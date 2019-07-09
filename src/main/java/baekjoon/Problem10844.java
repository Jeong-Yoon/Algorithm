package baekjoon;
/*
 * 쉬운 계단 수
 */

import java.util.Scanner;

public class Problem10844 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num[][] = new int[101][10];
		int N = sc.nextInt();

		num[1][0] = 0;
		for (int i = 1; i <= 9; i++) {
			num[1][i] = 1;
		}

		long answer = 0;

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				num[i][j] = 0;

				if (j == 0) {
					num[i][j] = num[i - 1][1];
				} else if (j == 9) {
					num[i][j] = num[i - 1][8];
				} else {
					num[i][j] = num[i - 1][j - 1] + num[i - 1][j + 1];
				}

				num[i][j] %= 1000000000;
			}
		}

		for (int i = 0; i <= 9; i++) {
			answer += num[N][i];
		}

		System.out.println(answer % 1000000000);
	}
}
