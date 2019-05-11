package programmers.summmercoding;

import java.util.ArrayList;
import java.util.List;

/*
올바른 괄호란 (())나 ()와 같이 올바르게 모두 닫힌 괄호를 의미합니다.
)(나 ())() 와 같은 괄호는 올바르지 않은 괄호가 됩니다.
괄호 쌍의 개수 N이 주어질 때, N개의 괄호 쌍으로 만들 수 있는 모든 가능한 괄호 문자열을 배열형태로 반환하는 함수 solution을 완성해 주세요.
반환되는 문자열 배열은 오름차순으로 정렬되어 있어야 합니다.

제한사항
괄호 쌍의 개수 N : 1 ≤ N ≤ 12, N은 정수

입출력 예
N	result
2	[ (()), ()() ]
3	[ ((())), (()()), (())(), ()(()), ()()() ]

입출력 예 설명
입출력 예 #1
2개의 괄호쌍으로 [ (()), ()() ]의 2가지를 만들 수 있습니다.
입출력 예 #2
3개의 괄호쌍으로 [ ((())), (()()), (())(), ()(()), ()()() ]의 5가지를 만들 수 있습니다.


 */
public class Programmers28770 {

    public static String[] solution(int n) {
        String[] answer = {};
        List<String> output = new ArrayList<>();
        build(n, "", output, n, n);
        answer = output.toArray(answer);
        return answer;

    }

    public static void build(int n, String cur, List output, int l, int r) {
        if (l > r)
            return;
        if ((l == 0 && r == 0)) {
            output.add(cur);
            return;
        }
        if (l > 0) {
            build(n, cur + "(", output, l - 1, r);
        }
        if (r > 0) {
            build(n, cur + ")", output, l, r - 1);
        }
    }

    public static void main(String args[]){
        Programmers28770 p = new Programmers28770();
        int n = 4;
        System.out.println(p.solution(4));
    }

}
