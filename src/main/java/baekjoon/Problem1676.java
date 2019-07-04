package baekjoon;

/*
팩토리얼 0의 개수
 */
import java.util.Scanner;

public class Problem1676 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cntT = 0;
		int cntF = 0;

		for (int i = 2; i <= n; i *= 2) {
			cntT += n / i;
		}
		for (int i = 5; i <= n; i *= 5) {
			cntF += n / i;
		}

		System.out.println(Math.min(cntT, cntF));
		sc.close();
	}
}
