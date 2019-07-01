package baekjoon;
/*
팩토리얼 0의 개수
 */
import java.util.Scanner;

public class Problem1676 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;
        int cntT = 0;
        int cntF = 0;
        if(n == 0){
            System.out.println(0);
        } else {
            for (int i = 1; i <= n; i++){
                answer *= i;
            }
        }
        while (answer % 2 == 0 || answer % 5 == 0){
            if(answer % 2 == 0){
                answer /= 2;
                cntT++;
            }
            if(answer % 5 == 0){
                answer /= 5;
                cntF++;
            }
        }
        System.out.println(Math.min(cntF,cntT));
        sc.close();
    }
}
