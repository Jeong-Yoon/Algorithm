package programmers;


public class Programmers12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2[0].length; j++){
                for (int k = 0; k < arr1[0].length; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12949 p = new Programmers12949();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] result =  p.solution(arr1,arr2);
        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                System.out.println(result[i][j]);
            }

        }
    }
}
