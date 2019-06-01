package programmers;

public class Programmers12939 {
    public String solution(String s) {
        String answer = "";
        String[] num = s.split(" ");
        int min = Integer.parseInt(num[0]);
        int max = Integer.parseInt(num[0]);
        for (int i = 1; i < num.length; i++){
            min = Math.min(min,Integer.parseInt(num[i]));
            max = Math.max(max,Integer.parseInt(num[i]));
        }
        answer = min + " " + max;
        return answer;
    }

    public static void main(String args[]){
        Programmers12939 p = new Programmers12939();
        System.out.println(p.solution("1 2 3 4"));
        System.out.println(p.solution("-1 -2 -3 -4"));
        System.out.println(p.solution("-1 -1"));
    }
}
