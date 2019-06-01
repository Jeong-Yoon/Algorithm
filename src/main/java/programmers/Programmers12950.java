package programmers;

public class Programmers12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[1].length];
        for (int i = 0; i < arr1.length; i++){
//            int[] a = arr1[i];
//            int[] b = arr2[i];
//            int x = arr1[i].length;
            for (int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String args[]){
        Programmers12950 p = new Programmers12950();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        for (int[] i : p.solution(arr1,arr2)){
            for (int j : i ){
                System.out.println(j);
            }
        }
    }
}
