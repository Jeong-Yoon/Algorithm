/*
 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 
 * 같은 열의 값을 서로 더한 결과가 됩니다. 
 * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 */
public class Programmers385845_01 {
	public static void main(String args[]) {
		Solution385845_1 sol = new Solution385845_1();
		int[][] arr1 = {{1,2},{3,4}};
		int[][] arr2 = {{5,6},{7,8}};
		int[][] ans = sol.solution(arr1, arr2);
		for(int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.println(ans[i][j]);
			}
		}
	}
}

class Solution385845_1 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				int x = arr1[i][j];
				int y = arr2[i][j];
				answer[i][j] = x+y;
			}
		}
        return answer;
    }
}
