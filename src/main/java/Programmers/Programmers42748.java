import java.util.Arrays;

public class Programmers42748 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int result = commands[i][2]-1;

        int[] num = new int[end-start];
            for (int j = 0; j < end-start; j++) {
                num[j] = array[start + j];
            }
            Arrays.sort(num);
            answer[i] = num[result];
        }
        return answer;
    }

    public static void main(String args[]){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = solution(array,commands);
        for (int i : answer){
            System.out.println(i);
        }

    }
}
