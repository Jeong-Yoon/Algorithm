package baekjoon;
/*
기타줄
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem1049 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int pack[] = new int[m];
        int indi[] = new int[m];
        int price = 0;
        for(int i = 0; i < m; i++){
        	pack[i] = sc.nextInt();
        	indi[i] = sc.nextInt();
        }
        
        Arrays.sort(pack);
        Arrays.sort(indi);
        
        while(n > 0){
        	if(n >= 6 && pack[0] < indi[0] * 6){
        		n -= 6;
        		price += pack[0];
        	} else if(n < 6 && pack[0] < indi[0] * n){
        		n -= 6;
        		price += pack[0];
        	} else{
        		price += indi[0] * n;
        		n = 0;
        	}
        }
        System.out.println(price);        
    }
}
