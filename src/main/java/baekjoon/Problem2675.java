package baekjoon;

/*
 * 문자열 반복
 */
import java.util.Scanner;

public class Problem2675 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					sb.append(S.charAt(j));
				}
			}
			System.out.println(sb.toString());
		}
	}
}
