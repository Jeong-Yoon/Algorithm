package Programmers;

public class Programmers12947 {
    public boolean solution(int x) {
        boolean answer = true;
        String strN = String.valueOf(x);
        int n = 0;
        for (int i = 0; i < strN.length(); i++){
            n += Integer.parseInt(strN.substring(i,i+1));
        }
        if (x % n != 0){
            answer = false;
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12947 p = new Programmers12947();
        System.out.println(p.solution(11));
        System.out.println(p.solution(12));
    }
}
