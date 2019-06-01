package programmers;

import java.util.Arrays;

public class Programmers42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].length() >= phone_book[i].length()){
                    if (phone_book[j].substring(0, phone_book[i].length()).equals(phone_book[i])) {
                        answer = false;
                    }
                }
//                if (phone_book[j].startsWith(phone_book[i])){
//                    answer = false;
//                    break;
//                }
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Programmers42577 p = new Programmers42577();
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"12", "53412", "567", "88"};
        System.out.println(p.solution(phone_book2));
    }
}
