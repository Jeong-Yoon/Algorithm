package programmers;

import java.util.PriorityQueue;

// PriorityQueue
public class Programmers42626 {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville){
            pq.add(i);
        }

        while (true){
            if(pq.size() < 2 && pq.peek() < K){
                return -1;
            }
            if(pq.peek() >= K){
                break;
            }
            int n1 = pq.poll();
            int n2 = pq.poll();
            int n3 = n1 + n2 * 2;
            pq.add(n3);
            answer++;
        }

        return answer;
    }

    public static void main(String args[]) {
        Programmers42626 p = new Programmers42626();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        System.out.println(p.solution(scoville, 7));
    }
}
