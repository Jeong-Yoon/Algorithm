package baekjoon;
/*
회의실배정
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem1931 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 1;
        int arr[][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] entry1, int[] entry2) {
                if(entry1[1] != entry2[1]){
                    int end1 = entry1[1];
                    int end2 = entry2[1];
                    return Integer.compare(end1, end2);
                }else {
                    int start1 = entry1[0];
                    int start2 = entry2[0];
                    return Integer.compare(start1, start2);
                }
            }
        });

        int end = arr[0][1];
        for(int i = 1; i < N; i++){
            if(end <= arr[i][0]){
                end = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
