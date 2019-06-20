package programmers;
/*
멀리뛰기
 */
public class Programmers12914 {
    public long solution(int n) {
        long answer = 0;
        int[] arr = new int[n+1];
        if(n > 2){
            arr[1] = 1;
            arr[2] = 2;
            for(int i = 3; i <= n; i++){
                arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
            }
            answer = arr[n];
        } else {
            answer = n;
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12914 p = new Programmers12914();
        System.out.println(p.solution(4));
        System.out.println(p.solution(3));
    }
}
