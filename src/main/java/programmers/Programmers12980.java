package programmers;
/*
2017 서머코딩
점프와 순간 이동
 */
public class Programmers12980 {
    public int solution(int n) {
        int ans = 0;
        String temp = Integer.toBinaryString(n);
        for(int i = 0; i < temp.length(); i++){
            if(temp.substring(i,i+1).equals("1")){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Programmers12980 p = new Programmers12980();
        System.out.println(p.solution(5));
        System.out.println(p.solution(6));
        System.out.println(p.solution(5000));
    }
}
