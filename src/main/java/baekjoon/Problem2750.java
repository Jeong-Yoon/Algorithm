package baekjoon;

/*
 * 수 정렬하기
 */
import java.util.*;

public class Problem2750 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);

		for (int i : num) {
			System.out.println(i);
		}
	}
}
