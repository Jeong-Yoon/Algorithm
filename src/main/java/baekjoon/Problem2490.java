package baekjoon;

import java.util.Scanner;

public class Problem2490 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] input = new String[3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextLine();
            for (int j = 0; j < input[i].length(); j++) {
                if (input[i].trim().charAt(j) == '0') {
                    count++;
                }
            }
            switch (count) {
                case 0:
                    System.out.println("E");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
            }
            count = 0;
        }

    }
}