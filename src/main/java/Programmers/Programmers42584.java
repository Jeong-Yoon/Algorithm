package Programmers;

public class Programmers42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length - 1; i++){
            answer[i] = 1;
            for(int j = i + 1; j < prices.length - 1; j++){
                if(prices[i] > prices[j]){
                    break;
                }else{
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers42584 p = new Programmers42584();
        int[] prices = {498,501,470,489};
        int[] answer = p.solution(prices);
        for(int i : answer){
            System.out.println(i);
        }
    }
}
