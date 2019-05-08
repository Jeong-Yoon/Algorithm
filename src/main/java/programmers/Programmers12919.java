package Programmers;

public class Programmers12919 {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i +"에 있다.";
                break;
            }
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12919 p = new Programmers12919();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(p.solution(seoul));
    }
}
