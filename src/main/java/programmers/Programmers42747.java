package programmers;

import java.util.Arrays;

public class Programmers42747 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int x = citations[citations.length-1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < citations.length; j++) {
                if (i <= citations[j]) {
                    if (i <= citations.length - j) {
                        answer = i;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Programmers42747 p = new Programmers42747();
        int[] citations = {3, 0, 6, 1, 5};
//        int[] citations = {1, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10};
        System.out.println(p.solution(citations));
    }
}