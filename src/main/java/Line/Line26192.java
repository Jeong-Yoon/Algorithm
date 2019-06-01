package Line;

import java.util.Scanner;

/*
문제 설명
유클리드 공간에서, 넓이가 N인 직사각형 두 변을 각각 w, h라 한다. 이때 가능한 w, h 중 |w - h|의 최솟값을 구하시오.

조건
사각형의 넓이 N (1 <= N <= 10^13), 변의 길이 w, h는 모두 자연수이다.

입력 형식
사각형 넓이 N을 표준 입력에서 읽는다.

출력 형식
|w - h|의 최솟값을 표준 출력에 쓴다.


 */
public class Line26192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int w = 1;
        int h = 1;

        if (N == 1){
            System.out.println(0);
        } else {
            for (int i = N; i >= N / 2; i--){
                if (N % i == 0){
                    w = i;
                    h = N / i;
                }
            }
            System.out.println(Math.abs(w-h));
        }
    }
}
