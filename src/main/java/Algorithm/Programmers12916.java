package Algorithm;

public class Programmers12916 {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.substring(i,i+1).equalsIgnoreCase("p")){
                pCnt++;
            }else if(s.substring(i,i+1).equalsIgnoreCase("y")){
                yCnt++;
            }
        }
        if (pCnt != yCnt){
            answer = false;
        }
        return answer;
    }
}
