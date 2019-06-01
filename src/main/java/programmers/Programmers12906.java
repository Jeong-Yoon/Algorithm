package programmers;

import java.util.*;

public class Programmers12906 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String args[]) {
        Programmers12906 p = new Programmers12906();
        int[] n1 = {1, 1, 3, 3, 0, 1, 1};
        int[] n2 = {4, 4, 4, 3, 3};

        int[] ans1 = p.solution(n1);
        int[] ans2 = p.solution(n2);

        for (int i : ans1) {
            System.out.println(i);
        }

        for (int i : ans2) {
            System.out.println(i);
        }
    }
}
