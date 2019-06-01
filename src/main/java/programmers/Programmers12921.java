package programmers;

public class Programmers12921 {
    public static int solution(int n) {
        int answer = 0;
        boolean[] primeList = new boolean[n + 1];
        primeList[0] = false;
        primeList[1] = false;
        for (int i = 2; i <= n; i++) {
            primeList[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (primeList[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primeList[j] = false;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (primeList[i] == true) {
                answer++;
            }
        }
        return answer;
    }
}
