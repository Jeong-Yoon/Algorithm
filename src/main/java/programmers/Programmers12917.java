package programmers;

import java.util.Arrays;

public class Programmers12917 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);
        for (int i = str.length-1; i >= 0; i--){
            answer = answer+str[i];
        }
        return answer;
    }

    public static void main(String args[]) {
        Programmers12917 p = new Programmers12917();
        System.out.println(p.solution("Zbcdefg"));
    }
}
