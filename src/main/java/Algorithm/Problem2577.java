package Algorithm;

import java.util.*;

public class Problem2577 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int x[] = new int[10];

        String num = String.valueOf(A*B*C);

        for (int i = 0; i < num.length(); i++) {
            switch(num.charAt(i)) {

                case '0':
                    x[0]++;
                    break;
                case '1':
                    x[1]++;
                    break;
                case '2':
                    x[2]++;
                    break;
                case '3':
                    x[3]++;
                    break;
                case '4':
                    x[4]++;
                    break;
                case '5':
                    x[5]++;
                    break;
                case '6':
                    x[6]++;
                    break;
                case '7':
                    x[7]++;
                    break;
                case '8':
                    x[8]++;
                    break;
                case '9':
                    x[9]++;
                    break;
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
