package programmers;

public class Programmers12926 {
    public String solution(String s, int n) {
        String answer = "";
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                if ((str[i] < 91 && 91 <= str[i] + n) || str[i] + n > 122) {
                    str[i] = (char) (str[i] + n - 26);
                } else {
                    str[i] = (char) (str[i] + n);
                }
            }
        }
        answer = String.valueOf(str);
        return answer;
    }

    public static void main(String args[]) {
        Programmers12926 p = new Programmers12926();
        System.out.println(p.solution("AB", 1));
        System.out.println(p.solution("z", 1));
        System.out.println(p.solution("z", 25));
        System.out.println(p.solution("ZYXSAQWEDFGVBNMCROPKLJUN", 25));
        System.out.println(p.solution("ZYXSAQWEDFGVBNMCROPKLJUN", 10));
        System.out.println(p.solution("ZAR", 10));
        System.out.println(p.solution("a B z", 4));
    }
}
