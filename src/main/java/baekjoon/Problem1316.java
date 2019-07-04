package baekjoon;

/*
 * 그룹 단어 체커
 */
import java.util.Scanner;

public class Problem1316 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			int temp = 0;
			for (int j = 0; j < str.length(); j++) {
				for (int k = j + 1; k < str.length(); k++) {
					if (str.charAt(j) == str.charAt(k) && str.charAt(j) != str.charAt(k-1)) {
						temp++;
						continue;
					}
				}
			}
			if(temp == 0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
