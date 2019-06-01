package programmers;

public class Programmers12943 {
    public static int solution(int num) {
        int answer = 0;
        long n = (long) num;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            answer++;
            if (answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}


