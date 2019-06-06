package programmers;

import java.util.Stack;

/*
2017 팁스타운
짝지어 제거하기
 */
public class Programmers12973 {

    public int solution(String s) {
        int answer = 0;

        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.empty()){
                stack.push(s.substring(i,i+1));
            } else{
                if(stack.peek().equals(s.substring(i,i+1))){
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            answer = 1;
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12973 p = new Programmers12973();
        System.out.println(p.solution("baabaa"));
        System.out.println(p.solution("cdcd"));
    }
}
