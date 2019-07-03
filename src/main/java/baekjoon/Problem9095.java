package baekjoon;

import java.util.Scanner;

/*
 * 1, 2, 3 더하기
 */

public class Problem9095 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[11];
		int t = sc.nextInt();
		num[0] = 1;
		num[1] = 1;
		num[2] = 2;
		num[3] = 4; 
		for(int i = 0; i < t; i++){
			int n = sc.nextInt();
			for(int j = 4; j <= n; j++){
				num[j] = num[j-1] + num[j-2] + num[j-3];
			}
			System.out.println(num[n]);
		}
	}
}
