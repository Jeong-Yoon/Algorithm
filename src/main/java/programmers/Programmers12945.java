package programmers;

public class Programmers12945 {
    public int solution(int n) {
        int answer = 0;
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i <= n; i++){
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % 1234567;
        }
        answer = fibonacci[n];
        return answer;
    }

    public static void main(String args[]){
        Programmers12945 p = new Programmers12945();
        System.out.println(p.solution(3));
        System.out.println(p.solution(5));
    }
}
