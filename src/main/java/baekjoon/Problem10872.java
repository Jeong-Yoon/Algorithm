package baekjoon;
/*
팩토리얼
 */
import java.util.Scanner;

public class Problem10872 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;
        if(n == 0){
            System.out.println(answer);
        } else {
            for (int i = 1; i <= n; i++){
                answer *= i;
            }
            System.out.println(answer);
        }
    }
}
