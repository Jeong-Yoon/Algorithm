import java.util.Stack;

class Solution {
       public int solution(String arrangement) {
        int answer = 0;
        Stack arr = new Stack();
        int stick = 0;

        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                if (arrangement.charAt(i + 1) != ')') {
                    arr.push(arrangement.charAt(i));
                    stick++;
                } else {
                    answer += arr.size();
                }
            } else if (arrangement.charAt(i) == ')') {
                if(arrangement.charAt(i-1) ==')'){
                    if (arr.size() != 0) {
                        arr.pop();
                    }
                }
            }
        }
        answer += stick;
        return answer;
    }
}
