package baekjoon;
/*
 * 스택
 */
import java.util.Scanner;
import java.util.Stack;

public class Problem10828 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			if (str.equals("push")) {
				int num = sc.nextInt();
				stack.push(num);
			} else if (str.endsWith("pop")) {
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
			} else if(str.equals("size")){
				System.out.println(stack.size());
			} else if(str.equals("empty")){
				if(stack.empty()){
					System.out.println(1);
				} else{
					System.out.println(0);
				}
			} else if(str.equals("top")){
				if(stack.isEmpty()){
					System.out.println(-1);
				} else{
					System.out.println(stack.peek());
				}
			}
		}
	}
}
