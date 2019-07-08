package baekjoon;

/*
 * 회사에 있는 사람
 */

import java.util.*;

public class Problem7785 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Set<String> log = new HashSet();
		ArrayList<String> list;
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] state = str.split(" ");
			if (state[1].equals("enter")) {
				log.add(state[0]);
			} else if (state[1].equals("leave")) {
				log.remove(state[0]);
			}
		}

		list = new ArrayList(log);

		Collections.sort(list, Collections.reverseOrder());
		for (String s : list) {
			System.out.println(s);
		}
	}
}
