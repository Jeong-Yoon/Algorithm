package programmers;
/*
스택/큐 : 다리를 지나는 트럭
 */

import java.util.LinkedList;
import java.util.Queue;

public class Programmers42583 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Truck> q = new LinkedList<Truck>();
        Truck truck = new Truck(truck_weights[0],bridge_length);
        q.add(truck);

        int sum = truck_weights[0];
        int index = 1;

        while (!q.isEmpty()){
            answer++;
            if (q.peek().length==0){
                Truck t = q.poll();
                sum -= t.getWeight();
            }

            if(index < truck_weights.length){
                if(q.size() < bridge_length && (sum + truck_weights[index]) <= weight){
                    truck = new Truck(truck_weights[index++],bridge_length);
                    q.add(truck);
                    sum += truck.getWeight();
                }
            }

            for (Truck t : q){
                t.minusLength();
            }
        }

        return answer;
    }

    class Truck{
        private int weight;
        private int length;

        public Truck(int weight, int length) {
            this.weight = weight;
            this.length = length;
        }

        public int getWeight() {
            return weight;
        }

        public int getLength() {
            return length;
        }

        public void minusLength(){
            length--;
        }
    }

    public static void main(String args[]) {
        Programmers42583 p = new Programmers42583();
        int bridge_length = 2;
        int weight = 10;
//        int[] truck_weights = {7, 4, 5, 6};
        int[] truck_weights = {7,6,4,5,5,1};
        System.out.println(p.solution(bridge_length, weight, truck_weights));
    }
}
