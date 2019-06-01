package programmers;

/*
스택/큐
프린터

 */
import java.util.LinkedList;

public class Programmers42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> queue =  new LinkedList<Integer>();

        for (int p:priorities){
            queue.offer(p);
        }

        while(!queue.isEmpty()){
            int item = queue.poll();
            boolean max = true;
            for(int i : queue){
                if(item < i){
                    max = false;
                    break;
                }
            }
            if(max){
                answer++;
                if(location == 0){
                    return answer;
                }
            } else {
                queue.offer(item);
            }
            location--;
            if(location < 0){
                location += queue.size();
            }

        }
        return answer;
    }

    public static void main(String args[]){
        Programmers42587 p = new Programmers42587();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(p.solution(priorities,location));
        System.out.println(p.solution(new int[]{1,1,9,1,1,1},0));
    }
}
