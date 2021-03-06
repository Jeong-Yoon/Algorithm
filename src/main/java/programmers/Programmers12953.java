package programmers;
/*
연습문제
N개의 최소공배수
 */
import java.util.Arrays;

public class Programmers12953 {
    public int solution(int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        int temp = arr[0];
        for(int i = 0; i < arr.length; i++){
            temp = temp * arr[i] / gcd(temp, arr[i]);
        }

        answer = temp;

//        int n = arr[arr.length - 1];
//        if(n == 1){
//            answer = n;
//        } else{
//            for (int i = n; i <= (n - 1) * n; i++) {
//                int cnt = 0;
//                for (int j = 0; j < arr.length; j++) {
//                    if (i % arr[j] == 0) {
//                        cnt++;
//                    }
//                }
//                if (cnt == arr.length) {
//                    answer = i;
//                    break;
//                }
//            }
//        }
        return answer;
    }

    public int gcd(int a, int b){
        while(b!=0){
            int r = a%b;
            a= b;
            b= r;
        }
        return a;
    }

    public static void main(String args[]) {
        Programmers12953 p = new Programmers12953();
        int[] arr1 = {2, 8, 6, 14};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {8, 3, 6, 24};
        int[] arr4 = {7, 3, 6, 24};
        int[] arr5 = {7, 8};
        System.out.println(p.solution(arr1));
        System.out.println(p.solution(arr2));
        System.out.println(p.solution(arr3));
        System.out.println(p.solution(arr4));
        System.out.println(p.solution(arr5));
        System.out.println(p.solution(new int[]{1,5}));
        System.out.println(p.solution(new int[]{1,1,1,1,1}));
        System.out.println(p.solution(new int[]{7}));
        System.out.println(p.solution(new int[]{95,96,97,98,99}));
    }
}
