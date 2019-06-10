package programmers;
/*
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )

 */
public class Programmers12951 {
    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        boolean first = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                first = true;
                sb.append(s.charAt(i));
            } else {
                if (!Character.isDigit(s.charAt(i)) && first){
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
                first = false;
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String args[]){
        Programmers12951 p = new Programmers12951();
        System.out.println(p.solution("3people unFollowed me"));
        System.out.println(p.solution("for the last week"));
        System.out.println(p.solution("for the last week  "));
    }
}
