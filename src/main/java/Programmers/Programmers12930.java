package Programmers;

public class Programmers12930 {
    public String solution(String s) {
        String answer = "";
//        String str[] = s.split("");
        StringBuffer sb = new StringBuffer();
        int cnt = 0;
//        for (int i = 0; i <str.length; i++) {
        for (int i = 0; i <s.length(); i++) {
//            if (str[i].equals(" ")) {
            if (s.charAt(i) == 32) {
                cnt = 0;
//                sb.append(str[i]);
                sb.append(s.charAt(i));
            }else {
                if (cnt % 2 == 0) {
//                    sb.append(str[i].toUpperCase());
                    sb.append(Character.toUpperCase(s.charAt(i)));
                }else {
//                    sb.append(str[i].toLowerCase());
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
                cnt++;
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String args[]) {
        Programmers12930 p = new Programmers12930();
        System.out.println(p.solution("try hello world") + "1234");
        System.out.println(p.solution("AAAAAAAAAAA A A A A AAAAA AAA") + "1234");
        System.out.println(p.solution("  A ") + "1234");
    }
}
