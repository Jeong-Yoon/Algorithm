package programmers.summmercoding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programmers28769 {
    public int solution(int[] s) {

            int answer = 0;
            int[] count = new int[4];
            for(int i = 0; i < s.length; i++){
                count[s[i] - 1]++;
            }

            while(true){
                boolean flag = false;
                if(count[0] != 0 && count[2] != 0 ){// 1, 3
                    count[0]--;
                    count[2]--;
                    answer++;
                    flag = true;
                }else if(count[1] > 1){
                    count[1] -= 2;
                    answer++;
                    flag = true;
                }else if(count[0] >0 && count[1] > 0){
                    if(count[0] == 1){ // 2, 1
                        answer++;
                        count[0]--;
                        count[1]--;
                    }else{  // 2 , 1 , 1
                        count[0]-=2;
                        count[1]--;
                        answer++;
                    }

                    flag = true;
                }else if(count[0] > 3){
                    count[0] -= 4;
                    answer ++;
                    flag = true;
                }else{
                    if(count[0] != 0) answer++;
                    if(count[1] != 0) answer++;
                    answer += count[2];
                    answer += count[3];
                }
                if(flag == false) break;
            }

            return answer;
        }




//        int answer = 0;
//        int temp = 0;
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length; i++) {
//            if (map.containsKey(s[i])) {
//                map.replace(s[i], map.get(s[i]) + 1);
//            } else {
//                map.put(s[i], 1);
//            }
//        }
//
//
//        Iterator<Integer> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            switch (iterator.next()) {
//                case 1:
//                    temp = Math.min(map.get(1), map.get(3));
//                    answer += temp;
//                    map.replace(1, map.get(1) - temp);
//                    map.replace(3, map.get(3) - temp);
//                    continue;
//                case 2:
//                    temp = map.get(2);
//                    answer += temp % 2;
//                    map.replace(2, map.get(2) - temp);
//                    continue;
//                case 3:
//                    answer += map.get(3);
//                    map.replace(3, 0);
//                    continue;
//                case 4:
//                    answer += map.get(4);
//                    continue;
//            }
//        }
//            if (iterator.next() == 1) {
//                temp = Math.min(map.get(1), map.get(3));
//                answer += temp;
//                map.replace(1, map.get(1) - temp);
//                map.replace(3, map.get(3) - temp);
//                continue;
//            } else if (iterator.next() == 2) {
//
//            } else if (iterator.next() == 3) {
//
//            } else if (iterator.next() == 4) {
//                answer += map.get(4);
//                continue;
//            }
//        }
//        for (int i = 1; i <= 4; i++){
//            if (i == 1) {
//                temp = Math.min(map.get(1), map.get(3));
//                answer += temp;
//                map.replace(1, map.get(1) - temp);
//                map.replace(3, map.get(3) - temp);
//                continue;
//            } else if (i == 2 && map.get(2) > 1) {
//                temp = map.get(2);
//                answer += temp / 2;
//                map.replace(2, map.get(2) - temp);
//                continue;
//            } else if (i == 3) {
//                answer += map.get(3);
//                map.replace(3, 0);
//                continue;
//            } else if (i == 4){
//                answer += map.get(4);
//                continue;
//            }
//        }
//        while (iterator.hasNext()) {
//            if (iterator.next() == 1) {
//                temp = Math.min(map.get(1), map.get(3));
//                answer += temp;
//                map.replace(1, map.get(1) - temp);
//                map.replace(3, map.get(3) - temp);
//            } else if (iterator.next() == 2) {
//                temp = map.get(2);
//                answer += temp / 2;
//                map.replace(2, map.get(2) - temp);
//            } else if (iterator.next() == 3) {
//                answer += map.get(3);
//                map.replace(3, 0);
//            }
//        }


//        while (iterator.hasNext()) {
//            int cnt = iterator.next();
//            if(cnt == 1){
//
//                temp = Math.min(map.get(cnt), map.get(2));
//                answer += temp;
//                map.replace(1, map.get(1) - temp);
//                map.replace(2, map.get(2) - temp);
//            }
//            if (cnt == 2) {
//
//            } else if (map.get(1) != 0 && map.get(2) == 0) {
//                if (map.get(1) > 4) {
//                    temp = map.get(1) / 4;
//                    answer += temp;
//                    map.replace(1, map.get(1) - temp);
//                } else if (map.get(1) <= 4) {
//                    answer += 1;
//                    map.replace(1, 0);
//                }
//            } else if (map.get(1) == 0 && map.get(2) != 0) {
//                answer += map.get(2);
//                map.replace(2, 0);
//            }
//        }


//        boolean[] visited = new boolean[s.length];
//
//        for (int i = 0; i < s.length; i++) {
//            int temp = s[i];
//            for (int j = 1; j < s.length; j++) {
//                if (visited[i] == false) {
//                    if (temp == 4) {
//                        visited[i] = true;
//                        answer++;
//                        break;
//                    } else if (visited[j] == false && temp + s[j] == 4) {
//                        visited[i] = true;
//                        visited[j] = true;
//                        answer++;
//                        break;
//                    } else if (visited[j] == false && temp + s[j] < 4) {
//
//                    }
//                } else {
//                    break;
//                }
//            }
//        }
//
//        for (boolean b : visited) {
//            if (b == false) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }

    public static void main(String args[]) {
        Programmers28769 p = new Programmers28769();
        int[] s = {1,2,4,3,3};
//        int[] s = {2, 3, 4, 4, 2, 1, 3, 1};
        System.out.println(p.solution(s));
    }
}
