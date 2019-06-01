package programmers;

import java.util.Arrays;

public class Programmers25167 {
    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        Arrays.sort(people);
        Arrays.sort(tshirts);
        for (int i = 0; i < people.length; i++){
            for (int j = 0; j < tshirts.length; j++){
                if (people[i] <= tshirts[j]){
                    answer++;
                    tshirts[j] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers25167 p = new Programmers25167();
        int[] people = {2,3};
        int[] tshirts = {1,2,3};
        System.out.println(p.solution(people,tshirts));
    }
}
