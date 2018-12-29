package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers12910 {
    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] answer = {};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrayList.add(arr[i]);
            }
        }
        if (arrayList.size() == 0) {
            answer = new int[]{-1};
        }else {
            answer = new int[arrayList.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arrayList.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
    
    public static void main(String args[]) {
        int[] arr = {3,2,6};
        solution(arr, 5);
        for (int i : solution(arr, 5)) {
            System.out.println(i);
        }
    }
}
