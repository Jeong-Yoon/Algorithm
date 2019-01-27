package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1874 {
    public static void main(String args[]) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] num = new int[size];
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int pushNum = 0;
        for (int i = 0; i < size; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= size; i++){
            stack.push(i);
            sb.append("+ \n");
            while (!stack.empty() && num[index] == stack.peek()){
                index++;
                stack.pop();
                sb.append("- \n");
            }
        }

        if (!stack.empty()) {
            System.out.println("NO");

        } else {
            System.out.println(sb.toString());
        }
    }
}
