package baekjoon;
/*
개미
 */
import java.util.Arrays;
import java.util.Scanner;

public class Problem4307 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int length = sc.nextInt();
            int antCnt = sc.nextInt();
            int[] ant = new int[antCnt];
            int min = length;
            int max = 0;
            for(int j = 0; j < antCnt; j++){
                ant[j] = sc.nextInt();
                if(ant[j] >= length/2){
                    min = Math.min(min, ant[j]);
                } else{
                    max = Math.max(max, ant[j]);
                }
            }
            Arrays.sort(ant);
            System.out.println(Math.max(length - min, max)+" "+Math.max(length - ant[0], ant[antCnt-1]));
        }
    }
}
