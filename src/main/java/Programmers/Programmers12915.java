package Programmers;

public class Programmers12915 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        for (int i = 0; i < strings.length-1; i++){
            for (int j = i + 1; j < strings.length; j++){

                if (strings[i].charAt(n) > strings[j].charAt(n)){
                    String tmp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = tmp;
                    break;
                }else if(strings[i].charAt(n) == strings[j].charAt(n)){
                    if(strings[i].compareTo(strings[j]) > 0){
                        String tmp = strings[j];
                            strings[j] = strings[i];
                            strings[i] = tmp;
                    }
                }
            }
        }

        answer = strings;
        return answer;
    }

    public static void main(String args[]){
        Programmers12915 p = new Programmers12915();
        String[] strings = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
        p.solution(strings,2);

        for (String s : strings){
            System.out.println(s);
        }
    }
}
