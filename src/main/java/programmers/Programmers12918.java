package programmers;

public class Programmers12918 {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > '9') {
                    answer = false;
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }


    public static void main(String args[]) {
        Programmers12918 p = new Programmers12918();
        System.out.println(p.solution("1234"));
    }
}
