package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers12910 {
    public static int[] newSolution (int[] arr, int divisor) {
        int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int num : arr) {
			if(num % divisor == 0) {
				list.add(num);
			}
		}
		
		answer = (list.size() == 0) ?  new int[]{-1} : list.stream().mapToInt(i -> i).toArray();
		Arrays.sort(answer);
		
		return answer;
    }
    
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
        } else {
            answer = new int[arrayList.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arrayList.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String args[]) {
        int[] arr = {3, 2, 6};
        solution(arr, 5);
        for (int i : solution(arr, 5)) {
            System.out.println(i);
        }
    }
}
