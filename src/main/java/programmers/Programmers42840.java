package programmers;
/*
  완전 탐색
  모의고사
 */
import java.util.*;

public class Programmers42840 {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[][] person = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		int[] result = new int[3];

		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			if (person[i].length == answers.length) {
				for (int j = 0; j < answers.length; j++) {
					if (person[i][j] == answers[j]) {
						cnt++;
					}
				}
			} else if (person[i].length > answers.length) {
				int[] tArr = Arrays.copyOfRange(person[i], 0, answers.length);
				for (int j = 0; j < answers.length; j++) {
					if (tArr[j] == answers[j]) {
						cnt++;
					}
				}
			} else {
				int length = person[i].length;
				int[] tArr = new int[length * (answers.length / length)];
				int index = 0;
				for (int k = 0; k < (answers.length / length); k++) {
					for (int x = 0; x < length; x++) {
						tArr[index] = person[i][x];
						index++;
					}
				}
				int[] nArr = Arrays.copyOfRange(person[i], 0, answers.length % length);
				int[] rArr = new int[tArr.length+nArr.length];
				System.arraycopy(tArr, 0, rArr, 0, tArr.length);
				System.arraycopy(nArr, 0, rArr, tArr.length, nArr.length);

				for (int j = 0; j < answers.length; j++) {
					if (rArr[j] == answers[j]) {
						cnt++;
					}
				}
			}
			result[i] = cnt;
		}

		int max = Math.max(result[0], Math.max(result[1], result[2]));
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			if (result[i] == max) {
				list.add(i + 1);
			}
		}
		answer = list.stream().mapToInt(i -> i).toArray();
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		Programmers42840 p = new Programmers42840();
		int[] ans1 = p.solution(new int[] { 1, 2, 3, 4, 5 });
		for (int i : ans1) {
			System.out.print(i + " ");
		}
		System.out.println("");
		int[] ans2 = p.solution(new int[] { 1, 3, 2, 4, 2 });
		for (int i : ans2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		int[] ans3 = p.solution(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }); //12
		for (int i : ans3) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
