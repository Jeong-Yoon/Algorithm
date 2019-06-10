package programmers;
/*
연습문제
124 나라의 숫자
 */
public class Programmers12899 {
    public String solution(int n) {
        String answer = "";

        while(n > 0){
            answer = mod(n) + answer;
            if(n % 3 == 0){
                n = n/3 - 1;
            } else {
                n = n/3;
            }
        }
        return answer;
    }

    public String mod(int n){
        String a = "";
        if(n%3 == 1){
            a = "1";
        } else if(n%3 == 2){
            a = "2";
        } else if(n%3 == 0){
            a = "4";
        }
        return a;
    }

    public static void main(String args[]){
        Programmers12899 p = new Programmers12899();
        System.out.println(p.solution(1));
        System.out.println(p.solution(2));
        System.out.println(p.solution(3));
        System.out.println(p.solution(4));
        System.out.println(p.solution(14));
        System.out.println(p.solution(24));
        System.out.println(p.solution(11));
    }
}
