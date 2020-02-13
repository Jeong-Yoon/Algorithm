package programmers;
/*
2016년
*/
public class Programmers12901 {
	public String solution(int a, int b) {
		String answer = "";
		String[] week = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0;
		if (a > 1) {
			for (int i = 0; i < a - 1; i++) {
				sum += days[i];
			}
		}
		answer = week[(sum + b - 1) % 7];
		return answer;
	}

	public static void main(String[] args) {
		Programmers12901 p = new Programmers12901();
		System.out.println(p.solution(5, 24));
		System.out.println(p.solution(1, 7));
	}
}
