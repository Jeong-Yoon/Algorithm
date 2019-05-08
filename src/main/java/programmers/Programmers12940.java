package Programmers;

public class Programmers12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i <= n; i++){
            if (n%i == 0 && m % i == 0){
                answer[0] = i;
            }
        }
        for (int i = m; i <= n * m; i++){
            if (i % n == 0 && i % m == 0){
                answer[1] = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12940 p = new Programmers12940();
        for (int i : p.solution(3,12)){
            System.out.println(i);
        }
    }
}
