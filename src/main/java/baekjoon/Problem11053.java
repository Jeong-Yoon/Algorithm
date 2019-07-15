package baekjoon;

/*
 * 가장 긴 증가하는 부분 수열
 */
import java.util.*;

public class Problem11053 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int dp[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		dp[0] = 1;
		for (int i = 1; i < N; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[i] <= dp[j]) {
					dp[i] = dp[j] + 1;
				} else if (arr[i] == arr[j]) {
					dp[i] = dp[j];
				}
			}
		}
		int max = 0;
		for (int i : dp) {
			max = Math.max(i, max);
		}
		System.out.println(max);
	}
}
