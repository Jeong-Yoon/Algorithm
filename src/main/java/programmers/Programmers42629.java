package programmers;

/*
힙: 라면공장
 */
public class Programmers42629 {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        while(k > 1){
            for (int i = 0; i < dates.length; i++){
                if(stock + supplies[i] <= k-1){
                    answer++;
                    k -= dates[i];
                } else {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers42629 p = new Programmers42629();
        System.out.println(p.solution(4 ,new int[]{4,10,15}, new int[]{20,5,10},30));
    }
}
