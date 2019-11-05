package baekjoon;

import java.util.Scanner;

public class Problem10819 {
    static int max = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        perm(num,0,n);
        System.out.println(max);
    }

    static void perm(int[] num, int depth, int n){
        if(depth == n){
            sum(num,depth);
        } else{
            for(int i = depth; i < n; i++){
                swap(num, i, depth);
                perm(num, depth+1, n);
                swap(num, i ,depth);
            }
        }
    }

    static void swap(int[] num, int depth, int n){
        int temp = num[depth];
        num[depth] = num[n];
        num[n] = temp;
    }

    static void sum(int num[], int k) {
        int sum = 0;
        for (int i = 2; i <= k; i++) {
            sum += Math.abs(num[i - 2] - num[i - 1]);
        }
        if (max < sum) {
            max = sum;
        }
    }
}
