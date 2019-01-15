package Algorithm;

import java.util.Arrays;

public class Programmers12933 {
    public long solution(long n) {
        long answer = 0;
        char[] number = Long.toString(n).toCharArray();

        String str = "";

        for (int i = 0; i < number.length; i++){
            for (int j = i+1; j < number.length; j++){
                if (number[i] - 48 < number[j] - 48){
                    char tmp = number[i];
                    number[i] = number[j];
                    number[j] = tmp;
                }
            }
        }
        str = new String(number);
        answer = Long.parseLong(str);

        return answer;
    }
    public static void main(String args[]){
        System.out.println(solution());
    }
}
