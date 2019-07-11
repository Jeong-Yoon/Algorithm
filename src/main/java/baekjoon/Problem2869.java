package baekjoon;

/*
 * 달팽이는 올라가고 싶다
 */

import java.util.Scanner;

public class Problem2869 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int days = 0;
		if ((V - B) % (A - B) == 0) {
			days = (V - B) / (A - B);
		} else {
			days = (V - B) / (A - B) + 1;
		}
		System.out.println(days);
	}
}
