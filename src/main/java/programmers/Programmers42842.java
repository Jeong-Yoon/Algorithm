package programmers;
/*
완전탐색
카펫
 */
public class Programmers42842 {
    public int[] solution(int brown, int red) {
        int[] answer = {};
        int sum = brown + red;
        int w = 0;
        int h = 0;
        for (int i = 3; i < sum / 3; i++) {
            if (sum % i == 0) {
                if ((i - 2) * (sum / i - 2) == red) {
                    h = i;
                    w = sum/i;
                    break;
                }
            }
        }
        answer = new int[]{w, h};
        return answer;
    }

    public static void main(String args[]) {
        Programmers42842 p = new Programmers42842();
        System.out.println(p.solution(10, 2));
        System.out.println(p.solution(8, 1));
        System.out.println(p.solution(24, 24));
    }
}
