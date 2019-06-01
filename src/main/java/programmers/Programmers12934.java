package programmers;

public class Programmers12934 {
    public long solution(long n) {
        long answer = 0;
        if(Math.sqrt(n)%1 == 0){
            answer = (long)Math.pow(Math.sqrt(n)+1,2);
        }else{
            answer = -1;
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12934 p = new Programmers12934();
        System.out.println(p.solution(121));
        System.out.println(p.solution(3));

    }
}
