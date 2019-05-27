package programmers;

import java.util.Arrays;

public class Programmers42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = 0;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        answer += n - lost.length;
        return answer;
    }

    public static void main(String args[]) {
        Programmers42862 p = new Programmers42862();
//        int n = 24;
        int n = 3;
//        int[] lost = {12, 13, 16, 17, 19, 20, 21, 22};
        int[] lost = {1, 2};
//        int[] reserve = {1, 22, 16, 18, 9, 10};
        int[] reserve = {2, 3};
        System.out.println(p.solution(n, lost, reserve));

        //24 [12, 13, 16, 17, 19, 20, 21, 22] [1, 22, 16, 18, 9, 10] 19
        // n = 3, lost = [1,2], reserve = [2,3]
//5, [2, 4], [1, 3, 5]
    }
}
