package baekjoon;
/*
평균은 넘겠지
 */
import java.util.Scanner;

public class Problem4344 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        for (int i = 0; i < C; i++) {
            int N = 0;
            float avg;
            float sum = 0;
            float cnt = 0;
            do{
                N = scan.nextInt();
            }while(N < 1 || 1000 < N);
            float[] a = new float[N];
            for (int j = 0; j < a.length; j++) {
                do{
                    a[j] = scan.nextInt();
                }while(a[j] < 0 || 100 < a[j]);
                sum += a[j];
            }
            avg = sum / N;
            for (int j = 0; j < a.length; j++) {
                if (a[j] > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", cnt/N*100,"%");
        }
    }
}
