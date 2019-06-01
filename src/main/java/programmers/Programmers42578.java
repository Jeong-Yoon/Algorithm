package programmers;

import java.util.*;

public class Programmers42578 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++){
            if (map.containsKey(clothes[i][1])){
                map.replace(clothes[i][1],map.get(clothes[i][1]) + 1);
            }else {
                map.put(clothes[i][1],1);
            }
        }

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            answer *= map.get(iterator.next()) + 1;
        }


        return answer - 1;
    }

    public static void main(String args[]){
        Programmers42578 p = new Programmers42578();
        String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(p.solution(clothes));
    }
}
