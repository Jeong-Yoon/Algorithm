package programmers;

import java.util.ArrayList;
import java.util.List;
/*
기능개발
 */
public class Programmers42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        int complete = 0;

        while(true){
            for(int i = 0; i < progresses.length; i++){
                progresses[i] += speeds[i];
            }
            if(progresses[cnt] >= 100){
                complete++;
                for(int i = cnt+1; i < progresses.length; i++){
                    if(progresses[i] < 100){
                        cnt = i;
                        break;
                    } else{
                        cnt++;
                        complete++;
                    }
                }
                list.add(complete);
                complete = 0;
            }
            if(cnt == progresses.length-1 && progresses[cnt] >= 100){
                break;
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers42586 p = new Programmers42586();
        for(int i : p.solution(new int[]{93,30,55},new int[]{1,30,5})){
            System.out.println(i);
        }
    }
}
