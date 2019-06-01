package programmers;

public class Programmers12931 {
    public int solution(int n) {
        int answer = 0;

        String strN = String.valueOf(n);
        for (int i = 0; i < strN.length(); i++){
            answer += Integer.parseInt(strN.substring(i,i+1));
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12931 p = new Programmers12931();
        System.out.println(p.solution(987));
    }
}
