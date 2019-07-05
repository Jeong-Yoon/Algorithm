package baekjoon;
/*
 * 피보나치 수2
 */
import java.util.Scanner;

public class Problem2748 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		if (n >= 2) {
			for (int i = 2; i <= n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		System.out.println(arr[n]);
	}
}
