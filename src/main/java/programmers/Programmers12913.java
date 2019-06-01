package programmers;

public class Programmers12913 {
    int solution(int[][] land) {
        int answer = 0;
        int a = 0;
        int max = 0;
        for (int i = 0; i < land.length; i++) {
            for (int j = 1; j < land[i].length; j++) {
                if (land[i][j] > land[i][j - 1]) {
                    if (a != j){
                        max = land[i][j];
                        a = j;
                    }
                }

            }
            answer += max;

        }
        return answer;
    }

    public static void main(String args[]) {
        Programmers12913 p = new Programmers12913();
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        System.out.println(p.solution(land));
    }
}
