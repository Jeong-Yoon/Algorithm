package programmers;

import java.util.Arrays;

public class Programmers25168 {
    public int[] solution(int[] healths, int[][] items) {
        int[] answer = {};
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < healths.length; i++){
            for (int j = 0; j < items.length; j++){
                    if (items[j][1] != 0 && healths[i] - items[j][1] >= 100){
                        sb.append(j+1);
                        items[j][1] = 0;
                        break;
                    }
            }
        }
        answer = new int[sb.toString().length()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(sb.substring(i,i+1));
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String args[]){
        Programmers25168 p = new Programmers25168();
        int[] healths = {200,120,150};
        int[][] items = {{30,100},{500,30},{100,400}};
        int[] healths1 = {300,200,500};
        int[][] items1 = {{1000, 600},{400, 500},{300, 100}};
        System.out.println(p.solution(healths,items));
        for (int i : p.solution(healths,items)){
            System.out.println(i);
        }
        for (int i : p.solution(healths1,items1)){
            System.out.println(i);
        }
    }

}
