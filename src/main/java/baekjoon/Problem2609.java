package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strNum = br.readLine().split(" ");

        int n1 = Integer.parseInt(strNum[0]);
        int n2 = Integer.parseInt(strNum[1]);
        int[] result = new int[2];
        for (int i = 1; i <= Math.min(n1,n2); i++){
            if (n1%i == 0 && n2 % i == 0){
                result[0] = i;
            }
        }
        for (int i = Math.max(n1,n2); i <= n1 * n2; i++){
            if (i % n1 == 0 && i % n2 == 0){
                result[1] = i;
                break;
            }
        }
        for (int i = 0; i < 2; i++){
            System.out.println(result[i]);
        }
    }
}
