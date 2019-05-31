package programmers;

/*
2017 팁스타운
예상 대진표
 */

public class Programmers12985 {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while(true){
            if(a != b) {
                answer++;

                if (a % 2 == 0) {
                    a /= 2;
                } else {
                    a = (a + 1) / 2;
                }

                if (b % 2 == 0) {
                    b /= 2;
                } else {
                    b = (b + 1) / 2;
                }
            } else if(a == b || a == b+1 || b == a+1){
                break;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Programmers12985 p = new Programmers12985();
        System.out.println(p.solution(8,4,7));
    }
}
