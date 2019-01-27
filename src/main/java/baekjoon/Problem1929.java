package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1929 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        ArrayList<Boolean> primeList = new ArrayList<Boolean>(N+1);
        primeList.add(false);
        primeList.add(false);
        for (int i = 2; i <= N; i++){
            primeList.add(i, true);
        }
        for (int i = 2; i * i <= N; i++){
            if (primeList.get(i)){
                for (int j = i*i; j <= N; j += i){
                    primeList.set(j,false);
                }
            }
        }
        for (int i = M; i <= N; i++){
            if (primeList.get(i)){
                System.out.println(i);
            }
        }
    }
}
