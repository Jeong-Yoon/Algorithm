package Programmers;

public class Programmers12932 {
    public int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        answer = new int[str.length()];
        for (int i = str.length(); i > 0; i--){
            answer[str.length()-i] = Integer.parseInt(str.substring(i-1,i));
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12932 p = new Programmers12932();
        int[] result = p.solution(12345);
        for (int i : result){
            System.out.println(i);
        }
    }
}
