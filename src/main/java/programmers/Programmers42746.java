package programmers;


/*
정렬 : 가장 큰 수
 */

import java.util.*;

public class Programmers42746 {

    public String solution(int[] numbers) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        if (list.get(0).equals("0")){
            return "0";
        }
        for (int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }

    public static void main(String args[]) {
        Programmers42746 p = new Programmers42746();
        int[] numbers = {3, 30, 34, 5, 9};
//        int[] numbers = {6, 10, 2};
//        int[] numbers = {0, 0, 0, 1000};
//        int[] numbers = {5, 546};
//        int[] numbers = {0,0,1000,0};
//        int[] numbers = {0,1000,0,0};
//        int[] numbers = {1000,0,0,0};
        System.out.println(p.solution(numbers));
    }
}
