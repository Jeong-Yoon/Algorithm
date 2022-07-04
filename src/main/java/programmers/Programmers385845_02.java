/*
 * 
 * 네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
 * 
 */

public class Programmers385845_02 {

	public static void main(String[] args) {
		Solution385845 s = new Solution385845();
		s.solution("one4seveneight");
		System.out.println(s.solution("one4seveneight"));
	}

}

class Solution385845 {
    public int solution(String s) {
    	String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	char[] temp = s.toCharArray();
        String answer = "";
        String a = "";
        for(int i = 0; i < temp.length; i++) {
        	if(Character.isDigit(temp[i])) {
        		answer += String.valueOf(temp[i]);
        	} else {
        		a += String.valueOf(temp[i]);
        		for (int j = 0; j < words.length; j++) {
					if(a.equals(words[j])) {
						answer += String.valueOf(j);
						a = "";
					}
				}
        	}
        }
        return Integer.parseInt(answer);
    }
}