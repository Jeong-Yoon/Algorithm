package programmers;

public class Programmers12948 {
    public String solution(String phone_number) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < phone_number.length(); i++){
            if( i < phone_number.length()-4){
                sb.append("*");
            }else {
                sb.append(phone_number.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String args[]){
        Programmers12948 p = new Programmers12948();
        System.out.println(p.solution("01033334444"));
        System.out.println(p.solution("027778888"));
    }
}
