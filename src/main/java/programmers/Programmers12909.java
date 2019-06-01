package programmers;

public class Programmers12909 {
    boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        int cnt1 = 0;
        int cnt2 = 0;
        if (str[0] == ')' || str[str.length-1] == '('){
            answer = false;
        }else {
            for (int i = 0; i < str.length; i++){
                if (str[i] == '('){
                    cnt1++;
                }else {
                    cnt2++;
                    if(cnt1 < cnt2){
                        answer = false;
                        break;
                    }
                }
            }
            if (cnt1 != cnt2){
                answer = false;
            }
        }

//        int cnt = 0;
//        if (str[0] == ')' || str[str.length-1] == '('){
//            answer = false;
//        }else {
//            for (int i = 0; i < str.length; i++){
//                if (str[i] == '('){
//                    cnt++;
//                }else {
//                    cnt--;
//                    if(cnt < 0){
//                        answer = false;
//                        break;
//                    }
//                }
//            }
//            if (cnt != 0){
//                answer = false;
//            }
//        }

        return answer;
    }

    public static void main(String args[]){
        Programmers12909 p = new Programmers12909();
        System.out.println(p.solution("()()")); //true
        System.out.println(p.solution("(())()")); //true
        System.out.println(p.solution(")()(")); //false
        System.out.println(p.solution("(()(")); //false
        System.out.println(p.solution("()))((()")); //false
        System.out.println(p.solution("())())"));
        System.out.println(p.solution("(((())))()"));
        System.out.println(p.solution("()(())")); //true
        System.out.println(p.solution("((()()))(())")); //true
    }
}
