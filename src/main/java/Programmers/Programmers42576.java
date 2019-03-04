package Programmers;

import java.util.*;

public class Programmers42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++){
            if(!map.containsKey(participant[i])){
                map.put(participant[i],1);
            }else {
                map.replace(participant[i],map.get(participant[i]) + 1);
            }
        }
        for (int i = 0; i < completion.length; i++){
            if (map.get(completion[i]) == 1){
                map.remove(completion[i]);
            } else {
                map.replace(completion[i],map.get(completion[i]) - 1);
            }
        }
        for(String s : map.keySet()){
           answer = s;
        }
        return answer;
    }

    public static void main(String args[]) {
        Programmers42576 p = new Programmers42576();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(p.solution(participant, completion));
    }
}
