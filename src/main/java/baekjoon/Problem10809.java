package baekjoon;

/*
 * 알파벳 찾기
 */
import java.util.Scanner;

public class Problem10809 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[26];
		String str = sc.nextLine();
		int temp = 0;
		num[0] = 97;

		for (int i = 1; i < num.length; i++) {
			num[i] = num[i - 1] + 1;
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = temp; j < str.length(); j++) {
				if (num[i] == str.charAt(j)) {
					num[i] = j;
					continue;
				}
			}
			if (num[i] >= 97) {
				num[i] = -1;
			}
			System.out.println(num[i]);
		}

	}
}
