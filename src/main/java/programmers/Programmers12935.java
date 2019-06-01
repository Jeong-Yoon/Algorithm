package programmers;

public class Programmers12935 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int tmp = arr[0];
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (tmp > arr[i]) {
                tmp = arr[i];
                min = i;
            }
        }
        for (int i = 0; i < min; i++) {
            answer[i] = arr[i];
        }
        for (int i = min; i < answer.length; i++) {
            answer[i] = arr[i + 1];
        }
        if (answer.length == 0) {
            answer = new int[]{-1};
        }
        return answer;
    }
}
