package Programmers;

import java.util.Arrays;

public class Programmers42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++){
            for (int j = i + 1; j < phone_book.length; j++){
                if (phone_book[j].contains(phone_book[i])){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers42577 p = new Programmers42577();
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"12", "123", "12345","567","88"};
        System.out.println(p.solution(phone_book2));
    }
}
