package baekjoon;

/*
 * 단어 공부
 */
import java.util.*;

public class Problem1157 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		int max = 0;
		char answer = ' ';

		for (Object s : map.keySet()) {
			if (max < map.get(s)) {
				max = map.get(s);
				answer = (char) s;
			} else if (max == map.get(s)) {
				answer = '?';
			}
		}

		System.out.println(answer);
	}
}
